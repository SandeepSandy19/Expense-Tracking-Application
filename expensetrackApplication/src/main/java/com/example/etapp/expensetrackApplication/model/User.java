package com.example.etapp.expensetrackApplication.model;

import java.util.List;
import java.util.Set;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//User.java
@Entity
public class User<Expense, Budget> {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 private String userName;
 
 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
 private List<Expense> expenses;
 
 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
 private List<Budget> budgets;
 
 // Getters and setters
}