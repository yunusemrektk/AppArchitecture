package com.example.mvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvp.R;
import com.example.mvp.presenter.ILoginPresenter;
import com.example.mvp.presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements ILoginView {
    EditText mail, password;
    Button btnLogin;
    ILoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initBusinessLogic();
    }

    private void initBusinessLogic() {
        loginPresenter = new LoginPresenter(this);
        btnLogin.setOnClickListener(view -> loginPresenter.onLogin(mail.getText().toString(), password.getText().toString()));
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