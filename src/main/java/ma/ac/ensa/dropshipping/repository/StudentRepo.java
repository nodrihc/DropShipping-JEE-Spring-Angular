package ma.ac.ensa.dropshipping.repository;

import ma.ac.ensa.dropshipping.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

public Student findById(int id);
}
