package ma.ac.ensa.dropshipping.Services;

import ma.ac.ensa.dropshipping.entity.Student;
import ma.ac.ensa.dropshipping.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StudentServone  {

    @Autowired
    StudentRepo studentRepo;

    public Student findById(int id)
    {
        return studentRepo.findById(id);
    }

    public Student save(Student student)
    {
        return studentRepo.save(student);
    }
}
