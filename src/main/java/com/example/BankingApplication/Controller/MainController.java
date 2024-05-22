package com.example.BankingApplication.Controller;

import com.example.BankingApplication.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("operations/")
public class MainController {

    @Autowired
    AccountService accountService;

    @GetMapping("getBalance")
    public ResponseEntity<Double> getBalance(){
        return new ResponseEntity<>(accountService.getBalance(), HttpStatus.OK);
    }

    @PutMapping("withdraw/{amt}")
    public ResponseEntity<String> withdraw(@PathVariable double amt){
        return accountService.withdraw(amt);
    }

    @PutMapping("deposite/{amt}")
    public ResponseEntity<String> deposite(@PathVariable double amt){
        return accountService.deposite(amt);
    }

}
