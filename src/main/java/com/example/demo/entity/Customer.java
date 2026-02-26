package com.example.demo.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

import lombok.Data;

/*
 * Customer Entity
 * ----------------
 * Stores authentication and basic identity data.
 * Used for:
 * ✔ Login
 * ✔ JWT
 * ✔ Identity
 */

@Entity
@Table(name="customers")
@Data
public class Customer {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long accountNo;


/*
Customer Full Name
*/
@Column(nullable=false)
private String customerName;


/*
Username (Login ID)
*/
@Column(unique=true,nullable=false)
private String username;


/*
Email Address
*/
@Column(unique=true,nullable=false)
private String email;


/*
Phone Number
*/
@Column(nullable=false)
private String phone;


/*
Encrypted Password
*/
@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
@Column(nullable=false)
private String password;


/*
Role → CUSTOMER / ADMIN
*/
@Column(nullable=false)
private String role;


/*
Registration Date
*/
private LocalDate createdDate;

}