package ma.ac.ensa.dropshipping.rest;

import ma.ac.ensa.dropshipping.Services.StudentServone;
import ma.ac.ensa.dropshipping.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentServone studentServone;

    @RequestMapping("/add")
    @ResponseBody
    public String save(@RequestBody Student student)
    {
        studentServone.save(student);
        return "OK";
    }

    @RequestMapping("/search/{id}")
    public Student save(@PathVariable("id") int id)
    {

        return studentServone.findById(id);
    }
}
