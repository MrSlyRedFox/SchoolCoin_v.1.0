package org.example.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.example.persist.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
