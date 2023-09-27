package com.sheryians.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheryians.major.modal.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}
