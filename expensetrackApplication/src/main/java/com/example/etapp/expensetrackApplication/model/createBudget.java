package com.example.etapp.expensetrackApplication.model;


import java.sql.Date;
import java.util.Set;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Budget.java
@Entity
public class createBudget {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 private double amount;
 private String color;
 private Date createdAt;
 private String name;
 
 @ManyToOne
 @JoinColumn(name = "user_id")
 private User user;
 
 // Getters and setters
}