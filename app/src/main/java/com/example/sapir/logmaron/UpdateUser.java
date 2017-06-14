package com.example.sapir.logmaron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UpdateUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user);
    }

    public void showMessage(View view)
    {
        Toast.makeText(this, "פה תהיה עוד בדיקת תקינות\nוטוסט עם זיתים", Toast.LENGTH_SHORT).show();
    }
}
