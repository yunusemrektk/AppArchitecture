package com.example.mvc.model;

import android.util.Patterns;

import androidx.core.util.PatternsCompat;

public class User implements IUser{
    private String mail, password;

    public User(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValid() {
        return !getMail().isEmpty() && getMail().matches(PatternsCompat.EMAIL_ADDRESS.pattern()) && getPassword().length() > 5;
    }
}
