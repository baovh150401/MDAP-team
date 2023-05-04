package com.example.ProjectDemo.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ProjectDemo.models.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}