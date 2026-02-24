package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
 * GlobalExceptionHandler
 * ----------------------
 * Handles exceptions globally.
 */

@RestControllerAdvice
public class GlobalExceptionHandler {


    /*
     * Duplicate User Exception
     */
    @ExceptionHandler(DuplicateUserException.class)
    public ResponseEntity<String>
    handleDuplicateUser(
            DuplicateUserException ex){

        return ResponseEntity
                .badRequest()
                .body(ex.getMessage());
    }


    /*
     * Customer Not Found
     */
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<String>
    handleCustomerNotFound(
            CustomerNotFoundException ex){

        return ResponseEntity
                .badRequest()
                .body(ex.getMessage());
    }


    /*
     * Generic Exception
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String>
    handleException(Exception ex){

        return ResponseEntity
                .badRequest()
                .body(ex.getMessage());
    }

}