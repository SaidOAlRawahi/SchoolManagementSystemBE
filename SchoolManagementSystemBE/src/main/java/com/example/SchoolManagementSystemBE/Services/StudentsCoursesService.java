package com.example.SchoolManagementSystemBE.Services;

import com.example.SchoolManagementSystemBE.Models.StudentCourse;
import com.example.SchoolManagementSystemBE.Repositories.StudentsCoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsCoursesService {
    @Autowired
    StudentsCoursesRepository studentsCoursesRepository;

    public List<StudentCourse> getAll(){
        return studentsCoursesRepository.findAll();
    }
    public StudentCourse getById(Integer id){return studentsCoursesRepository.findById(id).get();}

    public StudentCourse add(StudentCourse studentCourse){
        return studentsCoursesRepository.save(studentCourse);
    }

    public StudentCourse edit(StudentCourse studentCourse){return  studentsCoursesRepository.save(studentCourse);}

    public void delete(Integer id){studentsCoursesRepository.deleteById(id);}
}
