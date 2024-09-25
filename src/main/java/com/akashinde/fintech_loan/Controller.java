package com.akashinde.fintech_loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String home() {
        return "Welcome to the Fintech Loan API";
    }
}
