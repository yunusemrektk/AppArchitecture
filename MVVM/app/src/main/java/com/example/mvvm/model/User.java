package com.example.mvvm.model;

import androidx.annotation.Nullable;

public class User {

    @Nullable
    private String mail, password;

    public User(@Nullable String mail, @Nullable String password) {
        this.mail = mail;
        this.password = password;
    }

    @Nullable
    public String getMail() {
        return mail;
    }

    public void setMail(@Nullable String mail) {
        this.mail = mail;
    }

    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }
}
