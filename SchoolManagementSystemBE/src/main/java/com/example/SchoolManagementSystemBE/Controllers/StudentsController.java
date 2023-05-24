package com.example.SchoolManagementSystemBE.Controllers;

import com.example.SchoolManagementSystemBE.Models.Cls;
import com.example.SchoolManagementSystemBE.Models.Student;
import com.example.SchoolManagementSystemBE.Services.ClassesService;
import com.example.SchoolManagementSystemBE.Services.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentsController {
    @Autowired
    StudentsService studentsService;

    @GetMapping("/all")
    public List<Student> getAll(){
        return studentsService.getAll();
    }

    @GetMapping("/get")
    public Student getById(@RequestParam Integer id){
        return studentsService.getById(id);
    }

    @PostMapping
    public Student add(@RequestBody Student student) {
        Student addedStudent = studentsService.add(student);
        return addedStudent;
    }

    @PutMapping
    public String edit(@RequestBody Student student) {
        Student addedStudent = studentsService.add(student);
        return "class with id "+ student.getId()+ "is been edited";
    }

    @DeleteMapping("/delete={id}")
    public String delete(@PathVariable Integer id){
        studentsService.delete(id);
        return "class with id " + id + "has been deleted";
    }
}
