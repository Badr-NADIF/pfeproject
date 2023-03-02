package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Service1")
public class StudentServiceImpl implements StudentService {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("start method save");
        return studentRepository.save(studentMapper.convertToEntity(dto));
    }

    @Override
    public Boolean update(StudentDTO dto) {
        LOGGER.debug("start method update");
        return studentRepository.update(studentMapper.convertToEntity(dto));
    }

    @Override
    public Boolean delete(Long id) {
        LOGGER.debug("start method delete");
        return studentRepository.delete(id);
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("start method selectAll");
        return studentMapper.convertTosDtos(studentRepository.selectAll());
    }
}
