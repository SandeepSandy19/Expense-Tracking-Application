package com.example.etapp.expensetrackApplication.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.etapp.expensetrackApplication.repository.BudgetRepository;

import com.example.etapp.expensetrackApplication.model.createBudget;
import com.example.etapp.expensetrackApplication.repository.BudgetRepository;


@RestController
@RequestMapping("/api/budgets")
public class BudgetController<Budget> {

    @Autowired
    private BudgetRepository budgetRepository;

    // Get all budgets
    @GetMapping
    public List<Budget> getAllBudgets() {
        return (List<Budget>) budgetRepository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Budget> getExpenseById(@PathVariable Long id) {
        java.util.Optional<com.example.etapp.expensetrackApplication.model.createBudget> budget = budgetRepository.findById(id);
        return (ResponseEntity<Budget>) budget.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


    // Delete budget by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBudget(@PathVariable Long id) {
        budgetRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
