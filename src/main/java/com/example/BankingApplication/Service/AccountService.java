package com.example.BankingApplication.Service;

import com.example.BankingApplication.DTO.AccountRepo;
import com.example.BankingApplication.Model.Account;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepo accountRepo;


    public Double getBalance() {
        System.out.println(accountRepo.getBalance());
        return accountRepo.getBalance();
    }

    public ResponseEntity<String> withdraw(double amt) {
        double balance=accountRepo.getBalance();
        if(balance>=amt){
            balance-=amt;
            Account account=accountRepo.findAll().get(0);
            account.setBalance(balance);
            accountRepo.save(account);
            return new ResponseEntity<>("Withdrawn Successfully", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Insufficient Balance",HttpStatus.OK);
        }
    }

    public ResponseEntity<String> deposite(double amt) {
        Account account=accountRepo.findAll().get(0);
        account.setBalance(account.getBalance()+amt);
        accountRepo.save(account);
        return new ResponseEntity<>("Deposited Successfully", HttpStatus.OK);
    }
}
