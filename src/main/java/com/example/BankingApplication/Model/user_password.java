package com.example.BankingApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user_password {
    @Id
    private int id;
    private String passwords;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getUser_name() {
        return name;
    }

    public void setUser_name(String user_name) {
        this.name = user_name;
    }
}
