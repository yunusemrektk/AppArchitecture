package com.example.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvm.R;
import com.example.mvvm.databinding.ActivityMainBinding;
import com.example.mvvm.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
    }

    private void initBinding() {
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new LoginViewModel());
        activityMainBinding.executePendingBindings();
    }

    @BindingAdapter("showToastMessage")
    public static void runToastMessage(View view, String message) {
        if(message != null) {
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
        }
    }

    @BindingAdapter("passwordLogging")
    public static void runPasswordLog(View view, String password) {
        if(password != null) {
            System.out.println(password);
        }
    }
}