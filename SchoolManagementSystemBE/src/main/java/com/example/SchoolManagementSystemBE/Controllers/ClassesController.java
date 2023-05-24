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
    public Cls addClass(@RequestBody Cls cls) {
        Cls addedClass = classesService.addClass(cls);
        return addedClass;
    }

    @PutMapping
    public String editClass(@RequestBody Cls cls) {
        Cls editedClass = classesService.addClass(cls);
        return "class with id "+ cls.getId()+ "is been edited";
    }
    @DeleteMapping("/delete{id}")
    public String deleteClass(@PathVariable Integer id){
        classesService.deleteClass(id);
        return "class with id " + id + "has been deleted";
    }
}
