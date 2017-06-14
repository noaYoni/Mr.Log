package com.example.sapir.logmaron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LogIn(View aview) {
        Intent i = new Intent(getApplicationContext(), Notification.class);
        startActivity(i);
    }

    public void SignIn(View aview) {
        Intent i = new Intent(getApplicationContext(), newUser.class);
        startActivity(i);
    }
}
