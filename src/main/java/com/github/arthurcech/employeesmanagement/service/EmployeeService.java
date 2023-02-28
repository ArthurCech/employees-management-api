package com.github.arthurcech.employeesmanagement.service;

import com.github.arthurcech.employeesmanagement.domain.Employee;
import com.github.arthurcech.employeesmanagement.dto.EmployeeDTO;
import com.github.arthurcech.employeesmanagement.mapper.EmployeeMapper;
import com.github.arthurcech.employeesmanagement.repository.DepartmentRepository;
import com.github.arthurcech.employeesmanagement.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public EmployeeService(
            EmployeeRepository employeeRepository,
            DepartmentRepository departmentRepository
    ) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Transactional(readOnly = true)
    public Page<EmployeeDTO> findAll(Pageable pageable) {
        Page<Employee> employees = employeeRepository.findAll(pageable);
        return employees.map(employee -> {
            EmployeeDTO employeeDTO = EmployeeMapper.INSTANCE.toEmployeeDTO(employee);
            employeeDTO.setDepartmentId(employee.getDepartment().getId());
            return employeeDTO;
        });
    }

    @Transactional
    public EmployeeDTO insert(EmployeeDTO dto) {
        Employee employee = EmployeeMapper.INSTANCE.toEmployee(dto);
        employee.setDepartment(departmentRepository.getOne(dto.getDepartmentId()));
        employeeRepository.save(employee);
        EmployeeDTO employeeDTO = EmployeeMapper.INSTANCE.toEmployeeDTO(employee);
        employeeDTO.setDepartmentId(employee.getDepartment().getId());
        return employeeDTO;
    }

}
