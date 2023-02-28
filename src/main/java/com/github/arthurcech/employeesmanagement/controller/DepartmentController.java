package com.github.arthurcech.employeesmanagement.controller;

import com.github.arthurcech.employeesmanagement.dto.DepartmentDTO;
import com.github.arthurcech.employeesmanagement.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<DepartmentDTO> findAll() {
        return departmentService.findAll();
    }

}
