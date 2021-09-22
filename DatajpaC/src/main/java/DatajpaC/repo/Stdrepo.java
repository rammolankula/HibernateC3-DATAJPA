package DatajpaC.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import DatajpaC.model.Student;
@Repository
public interface Stdrepo extends JpaRepository<Student,Integer> {

}
