package com.example.etapp.expensetrackApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.etapp.expensetrackApplication.model.createBudget;

public interface BudgetRepository extends JpaRepository<createBudget, Long> {

	createBudget findByName(String name);
}
