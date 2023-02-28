package com.github.arthurcech.employeesmanagement.mapper;

import com.github.arthurcech.employeesmanagement.domain.Department;
import com.github.arthurcech.employeesmanagement.dto.DepartmentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    DepartmentDTO toDepartmentDTO(Department department);

}
