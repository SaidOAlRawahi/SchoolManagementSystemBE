package com.example.SchoolManagementSystemBE.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Integer id;

    String name;

    @OneToOne(mappedBy = "teacher")
    Course course;
}
