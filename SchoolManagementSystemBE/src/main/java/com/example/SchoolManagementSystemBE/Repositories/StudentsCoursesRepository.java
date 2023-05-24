package com.example.SchoolManagementSystemBE.Repositories;

import com.example.SchoolManagementSystemBE.Models.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsCoursesRepository extends JpaRepository<StudentCourse,Integer> {

}
