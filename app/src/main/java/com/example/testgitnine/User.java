package com.example.testgitnine;

public class User {
    private String email;
    private String uId;

    public User(String email, String uId) {
        this.email = email;
        this.uId = uId;
    }

    public String getEmail() {
        return email;
    }

    public String getuId() {
        return uId;
    }
}
