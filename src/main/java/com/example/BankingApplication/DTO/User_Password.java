package com.example.BankingApplication.DTO;

import com.example.BankingApplication.Model.user_password;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Password extends JpaRepository<user_password,Integer> {
    user_password findByName(String name);
}
