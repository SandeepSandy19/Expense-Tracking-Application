package com.example.etapp.expensetrackApplication.model;


import java.util.Date;
import java.util.Set;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class createExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private double amount;
    private String budgetId;
    private Date createdAt;
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    // Getters and setters
}