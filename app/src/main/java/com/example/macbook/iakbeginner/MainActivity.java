package com.example.macbook.iakbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String USERNAME ="username";
    public final static String PASSWORD ="password";

    private TextView tv_username;
    private TextView tv_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_username =findViewById(R.id.tv_username);
        tv_password =findViewById(R.id.tv_password);

        String username_intent = getIntent().getStringExtra(USERNAME);
        String password_intent = getIntent().getStringExtra(PASSWORD);


        tv_username.setText(username_intent);
        tv_password.setText(password_intent);


    }
}
