package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentRepository.class);
    @Override
    public Long save(StudentEntity dto) {
        LOGGER.debug("start method save");
        return 10l;
    }

    @Override
    public Boolean update(StudentEntity dto) {
        LOGGER.debug("start method update");
        return true;
    }

    @Override
    public Boolean delete(Long id) {
        LOGGER.debug("start method delete");
        return true;
    }

    @Override
    public List<StudentEntity> selectAll() {
        LOGGER.debug("start method selectAll");
        return new ArrayList<>();
    }
}
