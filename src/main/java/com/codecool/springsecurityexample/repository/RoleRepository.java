package com.codecool.springsecurityexample.repository;

import com.codecool.springsecurityexample.model.ERole;
import com.codecool.springsecurityexample.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
