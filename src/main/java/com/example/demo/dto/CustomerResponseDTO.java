package com.example.demo.dto;

import java.time.LocalDate;

import lombok.Data;

/*
 * CustomerResponseDTO
 * -------------------
 * Returned in API responses.
 */

@Data
public class CustomerResponseDTO {

    private Long accountNo;

    private String customerName;

    private String email;

    private String phone;

    private String address;

    private String accountType;

    private String username;

    private String role;

    private LocalDate createdDate;

}