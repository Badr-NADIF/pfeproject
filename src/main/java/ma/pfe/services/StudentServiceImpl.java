package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("Service1")
public class StudentServiceImpl implements StudentService {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;
    //    @Autowired
    //    private StudentMapper studentMapper;
    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        LOGGER.debug("mapping dto to entity : {} ",studentMapper.convertToEntity(dto));
        StudentDTO re = studentMapper.convertToDto(studentRepository.save(studentMapper.convertToEntity(dto)));
        return re.getStudentId().getId();
    }

    @Override
    public Long update(StudentDTO dto) {
        LOGGER.debug("start method update dto : {} ",dto);
        StudentDTO re = studentMapper.convertToDto(studentRepository.save(studentMapper.convertToEntity(dto)));
        return re.getStudentId().getId();
    }

    @Override
    public Boolean delete(StudentIdDTO idDto) {
        LOGGER.debug("start method delete by id : {} ",idDto);
        studentRepository.deleteById(studentMapper.studentIdDTOToStudentIdEntity(idDto));
        return true;
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("start method select All");
        return studentMapper.convertTosDtos(studentRepository.findAll());
    }

    @Override
    public StudentDTO selectById(StudentIdDTO idDto) {
        LOGGER.debug("start method find by id : {} ",idDto);
        Optional result = studentRepository.findById(studentMapper.studentIdDTOToStudentIdEntity(idDto));
        return studentMapper.convertToDto((StudentEntity) result.orElse(null));
    }
}
