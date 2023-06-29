package com.example.departmentservice.Repository;

import com.example.departmentservice.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {
    Department getDepartmentById(Long departmentId);
}
