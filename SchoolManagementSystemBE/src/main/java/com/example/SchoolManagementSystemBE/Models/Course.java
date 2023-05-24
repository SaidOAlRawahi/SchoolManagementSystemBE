package com.example.SchoolManagementSystemBE.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    String name;

    @ManyToOne
    Cls cls;

    @OneToOne
    Teacher teacher;

    @OneToMany(mappedBy = "course")
    List<StudentCourse> studentsCourses = new ArrayList<>();
}
