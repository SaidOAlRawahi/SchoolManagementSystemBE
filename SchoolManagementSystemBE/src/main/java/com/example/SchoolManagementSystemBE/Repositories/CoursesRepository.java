package com.example.SchoolManagementSystemBE.Repositories;

import com.example.SchoolManagementSystemBE.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Course,Integer> {
}
