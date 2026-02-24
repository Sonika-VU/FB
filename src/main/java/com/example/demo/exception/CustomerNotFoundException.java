package com.example.demo.exception;

/*
 * CustomerNotFoundException
 * -------------------------
 * Thrown when customer does not exist.
 */

public class CustomerNotFoundException
extends RuntimeException{

    public CustomerNotFoundException(String message){
        super(message);
    }

}