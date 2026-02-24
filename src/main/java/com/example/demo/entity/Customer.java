package com.example.demo.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.Data;

/*
 * Customer Entity
 * ----------------
 * This class represents the "customers" table in the database.
 * It stores customer personal details and login credentials.
 * Each customer will have a unique account number.
 */

@Entity                     // Marks this class as a JPA entity (DB Table)
@Table(name="customers")    // Table name in PostgreSQL
@Data                       // Lombok annotation (Generates getters, setters, toString, etc.)
public class Customer {

    /*
     * Primary Key
     * Account number is auto-generated for every customer.
     * This acts as unique Customer ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNo;


    /*
     * Customer full name
     */
    private String customerName;


    /*
     * Customer email address
     * Used for communication and notifications.
     */
    @Column(unique = true)
    private String email;


    /*
     * Customer phone number
     * Used for contact and verification.
     */
    private String phone;


    /*
     * Customer residential address
     */
    private String address;


    /*
     * Account type
     * Example: Savings / Current
     * Used as bank reference information.
     */
    private String accountType;


    /*
     * Username used for login
     * Must be unique for each customer.
     */
    @Column(unique = true)
    private String username;


    /*
     * Password used for login
     * Will be stored in encrypted form (BCrypt).
     * WRITE_ONLY ensures password is accepted in request
     * but never returned in API response.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;


    /*
     * Role of the user
     * Example: CUSTOMER / ADMIN
     * Useful for security later.
     */
    private String role;


    /*
     * Date when customer registered
     */
    private LocalDate createdDate;

}