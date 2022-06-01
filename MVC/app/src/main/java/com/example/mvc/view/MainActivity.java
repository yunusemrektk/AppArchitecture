package com.example.mvc.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvc.R;
import com.example.mvc.controller.ILoginController;
import com.example.mvc.controller.LoginController;

public class MainActivity extends AppCompatActivity implements ILoginView{
    EditText mail, password;
    Button btnLogin;
    ILoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initBusinessLogic();
    }

    private void initBusinessLogic() {
        loginController = new LoginController(this);
        btnLogin.setOnClickListener(view -> loginController.onLogin(mail.getText().toString(), password.getText().toString()));
    }

    private void initViews(){
        mail = findViewById(R.id.etMail);
        password = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    @Override
    public void onLoginSuccess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}