package com.github.arthurcech.employeesmanagement.repository;

import com.github.arthurcech.employeesmanagement.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
