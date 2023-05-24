package com.example.SchoolManagementSystemBE.Controllers;

import com.example.SchoolManagementSystemBE.Models.Cls;
import com.example.SchoolManagementSystemBE.Models.Student;
import com.example.SchoolManagementSystemBE.Models.StudentCourse;
import com.example.SchoolManagementSystemBE.Services.ClassesService;
import com.example.SchoolManagementSystemBE.Services.StudentsCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students_courses")
public class StudentsCoursesController {
    @Autowired
    StudentsCoursesService studentsCoursesService;

    @GetMapping("/all")
    public List<StudentCourse> getAll(){
        return studentsCoursesService.getAll();
    }

    @GetMapping("/get")
    public StudentCourse getById(@RequestParam Integer id){
        return studentsCoursesService.getById(id);
    }

    @PostMapping
    public StudentCourse add(@RequestBody StudentCourse studentCourse) {
        StudentCourse addedStudentCourse = studentsCoursesService.add(studentCourse);
        return addedStudentCourse;
    }

    @PutMapping
    public String edit(@RequestBody StudentCourse studentCourse) {
        StudentCourse addedStudentCourse = studentsCoursesService.add(studentCourse);
        return "class with id "+ addedStudentCourse.getId()+ "is been edited";
    }

    @DeleteMapping("/delete={id}")
    public String delete(@PathVariable Integer id){
        studentsCoursesService.delete(id);
        return "class with id " + id + "has been deleted";
    }
}
