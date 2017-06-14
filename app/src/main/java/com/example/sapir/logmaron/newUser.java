package com.example.sapir.logmaron;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class newUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
    }
    public void onSignUp() {

        EditText name = (EditText)findViewById(R.id.FirstName);
//        Editable email = emailEditText.getText();
        Toast.makeText(this, name.getText() , Toast.LENGTH_SHORT).show();

//        Intent i = new Intent(getApplicationContext(),Notification.class);
//        startActivity(i);
    }
}
