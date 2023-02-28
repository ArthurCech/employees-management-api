package com.github.arthurcech.employeesmanagement.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmployeeDTO {

    private Long id;
    @NotBlank(message = "Campo requerido")
    private String name;
    @Email(message = "Email inválido")
    private String email;
    @NotNull(message = "Campo requerido")
    private Long departmentId;

    public EmployeeDTO(
            Long id,
            String name,
            String email,
            Long departmentId
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

}
