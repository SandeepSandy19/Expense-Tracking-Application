package com.example.etapp.expensetrackApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etapp.expensetrackApplication.model.createExpense;


public interface ExpenseRepository extends JpaRepository<createExpense, Long> {
    // Additional methods if needed
}
