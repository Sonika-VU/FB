package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private LoanClient loanClient;
	
	@PutMapping("/approve")
	public LoanApplication approveLoan(@RequestParam Long applicationId) {
	    return loanClient.updateLoanStatus(applicationId, "APPROVED", "null");
	}

	@PutMapping("/deny")
	public LoanApplication denyLoan(@RequestParam Long applicationId,
	                                @RequestParam String reason) {
	    return loanClient.updateLoanStatus(applicationId, "DENIED", reason);
	}

	@PutMapping("/abeyance")
	public LoanApplication abeyanceLoan(@RequestParam Long applicationId) {
	    return loanClient.updateLoanStatus(applicationId, "ABEYANCE", "null");
	}

//	@PutMapping("/approve")
//	public LoanApplication approveLoan(@RequestParam Long applicationId) {
//		return loanClient.updateLoanStatus(applicationId, "APPROVED","all fine");
//	}
//
//	@PutMapping("/deny")
//	public LoanApplication denyLoan(@RequestParam Long applicationId) {
//		return loanClient.updateLoanStatus(applicationId, "DENIED","low credit score");
//	}
//
////	@PutMapping("/denyReason")
////	public LoanApplication denyLoanReason(@RequestParam Long applicationId) {
////		return loanClient.updateLoanStatusWithReason(applicationId, "DENIED", "low credit score");
////	}
//
//	@PutMapping("/abeyance")
//	public LoanApplication abeyanceLoan(@RequestParam Long applicationId) {
//		return loanClient.updateLoanStatus(applicationId, "ABEYANCE","wait..");
//	}

	@GetMapping("/list")
	public List<LoanApplication> listPendingLoans() {
		return loanClient.getPendingLoans();
	}
}
