package com.example.sapir.logmaron;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class addEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
    }
    public void AddEvent(View aview) {
        Intent i = new Intent(getApplicationContext(), Notification.class);
        startActivity(i);
    }
}
