package com.github.arthurcech.employeesmanagement.repository;

import com.github.arthurcech.employeesmanagement.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
