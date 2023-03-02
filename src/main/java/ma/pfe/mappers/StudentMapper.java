package ma.pfe.mappers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {

    public StudentEntity convertToEntity(StudentDTO dto){
        StudentEntity entity = new StudentEntity();
        entity.setName(dto.getName());
        entity.setId(dto.getId());
        return entity;
    }

    public List<StudentEntity> convertToEntities(List<StudentDTO> dtos){

        return dtos.stream()
                .map(dto -> convertToEntity(dto))
                .collect(Collectors.toList());
    }

    public StudentDTO convertToDto(StudentEntity entity){
        StudentDTO dto = new StudentDTO();
        dto.setName(entity.getName());
        dto.setId(entity.getId());
        return dto;
    }

    public List<StudentDTO> convertTosDtos(List<StudentEntity> entities){

        return entities.stream()
                .map(entity -> convertToDto(entity))
                .collect(Collectors.toList());
    }

}
