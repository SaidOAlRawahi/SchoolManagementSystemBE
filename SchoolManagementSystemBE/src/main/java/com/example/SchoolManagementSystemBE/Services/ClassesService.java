package com.example.SchoolManagementSystemBE.Services;

import com.example.SchoolManagementSystemBE.Models.Cls;
import com.example.SchoolManagementSystemBE.Repositories.ClassesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesService {
    @Autowired
    ClassesRepository classesRepository;

    public List<Cls> getAll(){return classesRepository.findAll();}
    public Cls getById(Integer id){return classesRepository.findById(id).get();}

    public Cls add(Cls cls){
        return classesRepository.save(cls);
    }

    public Cls edit(Cls cls){return  classesRepository.save(cls);}

    public void delete(Integer id){classesRepository.deleteById(id);}

}
