package com.example.sapir.logmaron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onUserUpdate() {
        Intent i = new Intent(getApplicationContext(),UpdateUser.class);
        startActivity(i);
    }
}
