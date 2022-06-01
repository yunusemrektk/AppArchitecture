package com.example.mvp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.mvp.model.User;

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