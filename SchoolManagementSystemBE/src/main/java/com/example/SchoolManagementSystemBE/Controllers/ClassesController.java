package com.example.SchoolManagementSystemBE.Controllers;

import com.example.SchoolManagementSystemBE.Models.Cls;
import com.example.SchoolManagementSystemBE.Services.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassesController {
    @Autowired
    ClassesService classesService;

    @GetMapping("/all")
    public List<Cls> getAll(){
        return classesService.getAll();
    }

    @GetMapping("/get")
    public Cls getById(@RequestParam Integer id){
        return classesService.getById(id);
    }

    @PostMapping
    public Cls add(@RequestBody Cls cls) {
        Cls addedClass = classesService.add(cls);
        return addedClass;
    }

    @PutMapping
    public String edit(@RequestBody Cls cls) {
        Cls editedClass = classesService.add(cls);
        return "class with id "+ cls.getId()+ "is been edited";
    }

    @DeleteMapping("/delete={id}")
    public String delete(@PathVariable Integer id){
        classesService.delete(id);
        return "class with id " + id + "has been deleted";
    }
}
