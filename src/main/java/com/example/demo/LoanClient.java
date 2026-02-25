package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "loan-service", url = "http://localhost:8080", configuration = FeignConfig.class)
public interface LoanClient {
	
	@PutMapping("/loan/status")
	LoanApplication updateLoanStatus(
	        @RequestParam("applicationId") Long applicationId,
	        @RequestParam("status") String status,
	        @RequestParam(value = "reason", required = false) String reason);

//    @PutMapping("/loan/status")
//    LoanApplication updateLoanStatus(
//            @RequestParam("applicationId") Long applicationId,
//            @RequestParam("status") String status,
//            @RequestParam("reason") String reason);


//    @PutMapping("/loan/deny")
//    LoanApplication updateLoanStatusWithReason(
//            @RequestParam("applicationId") Long applicationId,
//            @RequestParam("status") String status,
//            @RequestParam("reason") String reason);
//    
    
    @GetMapping("/loan/pending")
    List<LoanApplication> getPendingLoans();
}
