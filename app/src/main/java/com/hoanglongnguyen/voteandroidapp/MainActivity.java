package com.hoanglongnguyen.voteandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.hoanglongnguyen.voteandroidapp.activities.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(()->{

            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();

        },3000);

    }
}
