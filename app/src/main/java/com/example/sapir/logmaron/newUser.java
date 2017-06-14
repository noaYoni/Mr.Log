package com.example.sapir.logmaron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class newUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
    }
    public void onSignUp(View view) {

//        EditText name = (EditText)findViewById(R.id.FirstName);
//        Editable email = emailEditText.getText();
//        Toast.makeText(this, name.getText() , Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "פה תהיה בדיקת תקינות\nוטוסט עם זיתים", Toast.LENGTH_SHORT).show();

//        Intent i = new Intent(getApplicationContext(),Notification.class);
//        startActivity(i);
    }
}
