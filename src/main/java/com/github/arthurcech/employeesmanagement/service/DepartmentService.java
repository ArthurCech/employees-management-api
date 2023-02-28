package com.github.arthurcech.employeesmanagement.service;

import com.github.arthurcech.employeesmanagement.domain.Department;
import com.github.arthurcech.employeesmanagement.dto.DepartmentDTO;
import com.github.arthurcech.employeesmanagement.mapper.DepartmentMapper;
import com.github.arthurcech.employeesmanagement.repository.DepartmentRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Transactional(readOnly = true)
    public List<DepartmentDTO> findAll() {
        List<Department> departments = departmentRepository.findAll(Sort.by("name"));
        return departments.stream()
                .map(DepartmentMapper.INSTANCE::toDepartmentDTO)
                .collect(Collectors.toList());
    }

}
