package com.example.mvc;

import org.junit.Test;
import org.mockito.Mock;
import org.w3c.dom.Text;

import static org.junit.Assert.*;

import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;

import com.example.mvc.controller.LoginController;
import com.example.mvc.model.User;
import com.example.mvc.view.ILoginView;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginUnitTest {

    @Test
    public void validUserTest() {
        User user = new User("emre@abc.com", "123456");
        boolean isValid = user.isValid();
        assertTrue(isValid);
    }
}