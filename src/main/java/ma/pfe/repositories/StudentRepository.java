package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {

    Long save(StudentEntity dto);

    Boolean update(StudentEntity dto);

    Boolean delete(Long id);

    List<StudentEntity> selectAll();

}
