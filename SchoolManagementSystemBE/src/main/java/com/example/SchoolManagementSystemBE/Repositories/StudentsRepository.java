package com.example.SchoolManagementSystemBE.Repositories;

import com.example.SchoolManagementSystemBE.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Student,Integer> {
}
