package com.example.macbook.iakbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    public final static String USERNAME ="username";
    public final static String PASSWORD ="password";

    private TextView tv_username;
    private TextView tv_password;
    private ImageView iv_picture;

    private String link_picture = "https://cdn77.sadanduseless.com/wp-content/uploads/2014/06/funny-cat1.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_username =findViewById(R.id.tv_username);
        tv_password =findViewById(R.id.tv_password);
        iv_picture = findViewById(R.id.iv_picture);


        String username_intent = getIntent().getStringExtra(USERNAME);
        String password_intent = getIntent().getStringExtra(PASSWORD);


        tv_username.setText(username_intent);
        tv_password.setText(password_intent);

        Picasso.with(this)
                .load(link_picture)
                .into(iv_picture, new Callback() {

                    public void onSuccess() {
                        Toast.makeText(MainActivity.this, "Sukses Load", Toast.LENGTH_SHORT).show();
                    }

                    public void onError() {
                        Toast.makeText(MainActivity.this, "Gagal", Toast.LENGTH_SHORT).show();
                    }
                });


    }
}
