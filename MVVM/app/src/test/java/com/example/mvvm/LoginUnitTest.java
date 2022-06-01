package com.example.mvvm;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.mvvm.model.User;
import com.example.mvvm.viewmodel.LoginViewModel;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginUnitTest {

    @Test
    public void isUserValid(){
        LoginViewModel loginViewModel = new LoginViewModel();
        loginViewModel.setUserMail("emre@abc.com");
        loginViewModel.setUserPassword("123456");
        boolean isValid = loginViewModel.isInputDataValid();
        assertTrue(isValid);
    }
}