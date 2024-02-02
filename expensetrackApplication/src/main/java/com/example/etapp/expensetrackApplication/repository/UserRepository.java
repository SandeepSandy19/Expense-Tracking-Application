package com.example.etapp.expensetrackApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etapp.expensetrackApplication.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional methods if needed
}