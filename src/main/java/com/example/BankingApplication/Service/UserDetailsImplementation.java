package com.example.BankingApplication.Service;

import com.example.BankingApplication.Model.user_password;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class UserDetailsImplementation implements UserDetails {

    private user_password userpassword;
    public UserDetailsImplementation(){
    }
    public UserDetailsImplementation(user_password userpassword){
        this.userpassword=userpassword;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return userpassword.getPasswords();
    }

    @Override
    public String getUsername() {
        return userpassword.getUser_name();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
