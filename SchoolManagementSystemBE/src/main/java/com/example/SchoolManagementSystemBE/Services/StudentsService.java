package com.example.SchoolManagementSystemBE.Services;

import com.example.SchoolManagementSystemBE.Models.Course;
import com.example.SchoolManagementSystemBE.Models.Student;
import com.example.SchoolManagementSystemBE.Repositories.CoursesRepository;
import com.example.SchoolManagementSystemBE.Repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    StudentsRepository studentsRepository;

    public List<Student> getAll(){
        return studentsRepository.findAll();
    }
    public Student getById(Integer id){return studentsRepository.findById(id).get();}

    public Student add(Student student){
        return studentsRepository.save(student);
    }

    public Student edit(Student student){return  studentsRepository.save(student);}

    public void delete(Integer id){studentsRepository.deleteById(id);}
}
