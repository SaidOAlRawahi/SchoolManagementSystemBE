package com.example.SchoolManagementSystemBE.Services;

import com.example.SchoolManagementSystemBE.Models.Course;
import com.example.SchoolManagementSystemBE.Repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
    @Autowired
    CoursesRepository coursesRepository;

    public List<Course> getAll(){
        return coursesRepository.findAll();
    }
    public Course getById(Integer id){return coursesRepository.findById(id).get();}

    public Course add(Course course){
        return coursesRepository.save(course);
    }

    public Course edit(Course course){return  coursesRepository.save(course);}

    public void delete(Integer id){coursesRepository.deleteById(id);}
}
