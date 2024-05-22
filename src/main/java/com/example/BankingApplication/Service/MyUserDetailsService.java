package com.example.BankingApplication.Service;

import com.example.BankingApplication.DTO.User_Password;
import com.example.BankingApplication.Model.user_password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    User_Password userpassword;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        user_password user=userpassword.findByName(username);
        if(user==null)
            throw new UsernameNotFoundException("User not found");
        return new UserDetailsImplementation(user);
    }
}
