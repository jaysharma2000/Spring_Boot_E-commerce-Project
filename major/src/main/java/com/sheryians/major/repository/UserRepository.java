package com.sheryians.major.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheryians.major.modal.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findUserByEmail(String email);
    
}
