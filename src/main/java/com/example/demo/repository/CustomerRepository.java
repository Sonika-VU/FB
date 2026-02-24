package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Customer;

/*
 * CustomerRepository
 * ------------------
 * This interface is used to communicate with the database.
 * JpaRepository provides automatic CRUD operations.
 */

public interface CustomerRepository 
        extends JpaRepository<Customer, Long>{

    /*
     * Custom Method
     * Used for login functionality.
     * Finds customer using username.
     */
    Customer findByUsername(String username);

}