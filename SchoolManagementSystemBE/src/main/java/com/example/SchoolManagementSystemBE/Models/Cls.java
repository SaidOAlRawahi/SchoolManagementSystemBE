package com.example.SchoolManagementSystemBE.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data
@Entity
public class Cls {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    String name;

    @OneToMany
    @JoinColumn(name = "class_id", referencedColumnName = "id")
    List<Course> courses = new ArrayList<>();
}