package com.example.demosecuritybasic.repository;

import com.example.demosecuritybasic.model.ERole;
import com.example.demosecuritybasic.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName (ERole name);
}
