package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

import lombok.Data;

/*
 * CustomerProfile Entity
 * ----------------------
 * Stores PAN based business details.
 * One Customer → One Profile
 */

@Entity
@Table(name = "customer_profile")
@Data
public class CustomerProfile {


/*
Primary Key
*/
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


/*
Foreign Key → Customer Table
*/
@Column(nullable = false, unique = true)
private Long accountNo;


/*
PAN Number
Business Identifier
*/
@Column(nullable = false, unique = true)
private String pan;


/*
Date Of Birth
*/
private LocalDate dob;


/*
Address
*/
private String address;


/*
Bank Account Number
*/
private String bankAccount;


/*
IFSC Code
*/
private String ifsc;


/*
Annual Income
*/
private Double annualIncome;


/*
Occupation
*/
private String occupation;


/*
Profile Created Date
*/
private LocalDate createdDate;


}