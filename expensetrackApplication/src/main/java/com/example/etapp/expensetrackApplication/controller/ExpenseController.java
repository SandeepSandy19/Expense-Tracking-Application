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

import com.example.etapp.expensetrackApplication.repository.ExpenseRepository;

import com.example.etapp.expensetrackApplication.model.User;
import com.example.etapp.expensetrackApplication.repository.UserRepository;


@RestController
@RequestMapping("/api/expenses")
public class ExpenseController<Expense> {

    @Autowired
    private ExpenseRepository expenseRepository;

    // Get all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        return (List<Expense>) expenseRepository.findAll();
    }

    // Get expense by ID
    @GetMapping("/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable Long id) {
        java.util.Optional<com.example.etapp.expensetrackApplication.model.createExpense> expense = expenseRepository.findById(id);
        return (ResponseEntity<Expense>) expense.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    
    // Delete expense by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Long id) {
        expenseRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}



