package com.example.SchoolManagementSystemBE.Repositories;

import com.example.SchoolManagementSystemBE.Models.Cls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepository extends JpaRepository<Cls,Integer> {
}
