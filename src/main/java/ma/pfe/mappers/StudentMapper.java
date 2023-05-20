package ma.pfe.mappers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentIdEntity;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface StudentMapper {
    public StudentEntity convertToEntity(StudentDTO dto);
    public List<StudentEntity> convertToEntities(List<StudentDTO> dtos);
    public StudentDTO convertToDto(StudentEntity entity);
    public List<StudentDTO> convertTosDtos(List<StudentEntity> entities);
    StudentIdEntity studentIdDTOToStudentIdEntity(StudentIdDTO studentIdDTO);




//    public StudentEntity convertToEntity(StudentDTO dto){
//        StudentEntity entity = new StudentEntity();
////        entity.setId(dto.getId());
////        entity.setStudentId(new StudentIdEntity(dto.getId(), ""));
//        entity.setName(dto.getName());
//        return entity;
//    }
//    public List<StudentEntity> convertToEntities(List<StudentDTO> dtos){
//
//        return dtos.stream()
//                .map(dto -> convertToEntity(dto))
//                .collect(Collectors.toList());
//    }
//    public StudentDTO convertToDto(StudentEntity entity){
//        StudentDTO dto = new StudentDTO();
////        dto.setId(entity.getId());
////        dto.setId(entity.getStudentId().getId());
//        dto.setName(entity.getName());
//        return dto;
//    }

//    public List<StudentDTO> convertTosDtos(List<StudentEntity> entities){
//
//        return entities.stream()
//                .map(entity -> convertToDto(entity))
//                .collect(Collectors.toList());
//    }

}
