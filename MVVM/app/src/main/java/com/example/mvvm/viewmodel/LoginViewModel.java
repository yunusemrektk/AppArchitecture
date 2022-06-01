package com.example.mvvm.viewmodel;

import androidx.core.util.PatternsCompat;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvm.BR;
import com.example.mvvm.model.User;

public class LoginViewModel extends BaseObservable {
    private User user;
    private final String successMessage = "Login was successful";
    private final String errorMessage = "User is not valid";

    public LoginViewModel() {
        this.user = new User("","");
    }

    @Bindable
    private String toastMessage = null; // Binds to Login Button.

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void setUserMail(String email) {
        user.setMail(email);
        notifyPropertyChanged(BR.userMail);
    }

    public void setUserPassword(String password) {
        user.setPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }

    @Bindable
    public String getUserMail() {
        return user.getMail();
    } // Binds to activity_main.xml

    @Bindable
    public String getUserPassword() {
        return user.getPassword();
    } // Binds to activity_main.xml

    public void onLoginClicked() {
        if (isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    public boolean isInputDataValid() {
        return !getUserMail().isEmpty() && getUserMail().matches(PatternsCompat.EMAIL_ADDRESS.pattern()) && getUserPassword().length() > 5;
    }
}
