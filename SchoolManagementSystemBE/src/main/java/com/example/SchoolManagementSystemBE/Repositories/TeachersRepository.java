package com.example.SchoolManagementSystemBE.Repositories;

import com.example.SchoolManagementSystemBE.Models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends JpaRepository<Teacher,Integer> {

}
