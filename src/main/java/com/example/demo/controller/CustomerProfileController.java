package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CustomerProfile;
import com.example.demo.service.CustomerProfileService;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/profile")
public class CustomerProfileController {

@Autowired
private CustomerProfileService profileService;

@Autowired
private CustomerService customerService;


/*
Create Profile
*/
@PostMapping("/create")
public CustomerProfile createProfile(

@RequestBody CustomerProfile profile,

Authentication auth){

String username =
auth.getName();

Long accountNo =
customerService
.getCustomerByUsernameDTO(username)
.getAccountNo();

return profileService
.createProfile(accountNo,profile);

}


/*
Get Own Profile
*/
@GetMapping("/my")
public CustomerProfile getProfile(

Authentication auth){

String username =
auth.getName();

Long accountNo =
customerService
.getCustomerByUsernameDTO(username)
.getAccountNo();

return profileService
.getProfile(accountNo);

}


/*
PAN Lookup
*/
@GetMapping("/pan/{pan}")
public CustomerProfile getByPan(

@PathVariable String pan){

return profileService
.getByPan(pan);

}

}