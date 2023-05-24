package com.example.SchoolManagementSystemBE.Controllers;

import com.example.SchoolManagementSystemBE.Models.Course;
import com.example.SchoolManagementSystemBE.Services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {
    @Autowired
    CoursesService coursesService;

    @GetMapping("/all")
    public List<Course> getAll(){
        return coursesService.getAll();
    }

    @GetMapping("/get")
    public Course getById(@RequestParam Integer id){
        return coursesService.getById(id);
    }

    @PostMapping
    public Course add(@RequestBody Course course) {
        Course addedCourse = coursesService.add(course);
        return addedCourse;
    }

    @PutMapping
    public String edit(@RequestBody Course course) {
        Course editedCourse = coursesService.add(course);
        return "course with id "+ course.getId()+ " is been edited";
    }
    @DeleteMapping("/delete={id}")
    public String delete(@PathVariable Integer id){
        coursesService.delete(id);
        return "course with id " + id + " has been deleted";
    }
}
