package com.example.demo.dto;

import lombok.Data;

/*
 * CustomerRequestDTO
 * ------------------
 * Used for Registration and Update APIs.
 */

@Data
public class CustomerRequestDTO {

    private String customerName;

    private String email;

    private String phone;

    private String address;

    private String accountType;

    private String username;

    private String password;

}