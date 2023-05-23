package com.example.SchoolManagementSystemBE.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Data
public class StudentCourse {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    Integer grade;

    @ManyToOne
    Course course;

    @ManyToOne
    Student student;
}
