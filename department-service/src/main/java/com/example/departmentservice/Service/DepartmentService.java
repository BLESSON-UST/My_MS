package com.example.departmentservice.Service;

import com.example.departmentservice.Entity.Department;
import com.example.departmentservice.Repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;


    public Department saveDepartment(Department department) {
        Department savedDepartment = departmentRepo.save(department);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED).getBody();
    }

    public Department getDepartmentById(Long departmentId) {
        Department department = departmentRepo.getDepartmentById(departmentId);
        return ResponseEntity.ok(department).getBody();
    }
}
