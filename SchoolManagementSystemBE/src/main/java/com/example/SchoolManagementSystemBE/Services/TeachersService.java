package com.example.SchoolManagementSystemBE.Services;

import com.example.SchoolManagementSystemBE.Models.Course;
import com.example.SchoolManagementSystemBE.Models.Teacher;
import com.example.SchoolManagementSystemBE.Repositories.CoursesRepository;
import com.example.SchoolManagementSystemBE.Repositories.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersService {
    @Autowired
    TeachersRepository teachersRepository;

    public List<Teacher> getAll(){
        return teachersRepository.findAll();
    }
    public Teacher getById(Integer id){return teachersRepository.findById(id).get();}

    public Teacher add(Teacher teacher){
        return teachersRepository.save(teacher);
    }

    public Teacher edit(Teacher teacher){return  teachersRepository.save(teacher);}

    public void delete(Integer id){teachersRepository.deleteById(id);}
}
