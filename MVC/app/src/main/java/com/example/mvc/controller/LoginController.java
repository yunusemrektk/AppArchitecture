package com.example.mvc.controller;

import com.example.mvc.model.User;
import com.example.mvc.view.ILoginView;

public class LoginController implements ILoginController {

    ILoginView iLoginView;
    private final String successMessage = "Login was successful";
    private final String errorMessage = "User is not valid";

    public LoginController(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    @Override
    public void onLogin(String mail, String password) {
        User user = new User(mail, password);
        if(user.isValid())
            iLoginView.onLoginSuccess(successMessage);
        else
            iLoginView.onLoginError(errorMessage);
    }
}
