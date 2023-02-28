package com.github.arthurcech.employeesmanagement.repository;

import com.github.arthurcech.employeesmanagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
