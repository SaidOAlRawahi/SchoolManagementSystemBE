package com.example.SchoolManagementSystemBE.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Data
@Entity
public class Class {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    String name;

    @OneToMany(mappedBy = "cls")
    Set<Course> courses = new HashSet<Course>();
}