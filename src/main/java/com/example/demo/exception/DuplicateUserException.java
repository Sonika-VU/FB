package com.example.demo.exception;

/*
 * DuplicateUserException
 * ----------------------
 * Thrown when username or email already exists.
 */

public class DuplicateUserException 
extends RuntimeException{

    public DuplicateUserException(String message){
        super(message);
    }

}