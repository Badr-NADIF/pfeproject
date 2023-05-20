package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentIdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, StudentIdEntity> {

//    CrudRepository r1=null;
//    PagingAndSortingRepository r2=null;

}
