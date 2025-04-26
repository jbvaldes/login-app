package com.example;

public class Login {
    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "password123".equals(password);
    }
}