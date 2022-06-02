package com.example.mvp.presenter;

import com.example.mvp.model.User;
import com.example.mvp.view.ILoginView;

public class LoginPresenter implements ILoginPresenter{
    ILoginView loginView;

    private final String successMessage = "Login was successful";
    private final String errorMessage = "User is not valid";

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String mail, String password) {
        User user = new User(mail, password);
        if(user.isValid())
            loginView.onLogin(successMessage);
        else
            loginView.onLogin(errorMessage);
    }
}
