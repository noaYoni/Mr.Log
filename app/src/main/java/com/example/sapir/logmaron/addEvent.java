package com.example.sapir.logmaron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class addEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
    }

    public void showMessage(View view){
        Toast.makeText(this, "פה תהיה הוספה של טוסט עם זיתים", Toast.LENGTH_SHORT).show();
    }
}
