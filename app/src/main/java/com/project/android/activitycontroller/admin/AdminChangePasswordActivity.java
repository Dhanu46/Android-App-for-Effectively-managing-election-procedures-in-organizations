package com.project.android.activitycontroller.admin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.project.android.R;

public class AdminChangePasswordActivity extends AppCompatActivity {
    private EditText usernameET,passwordET;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword);
        initializeUIComponents();
    }

    public void initializeUIComponents()
    {

    }
}

