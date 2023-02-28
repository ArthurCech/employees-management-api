package com.github.arthurcech.employeesmanagement.mapper;

import com.github.arthurcech.employeesmanagement.domain.Employee;
import com.github.arthurcech.employeesmanagement.dto.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(target = "departmentId", ignore = true)
    EmployeeDTO toEmployeeDTO(Employee employee);

    Employee toEmployee(EmployeeDTO employeeDTO);

}
