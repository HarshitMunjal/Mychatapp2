package com.example.mychatapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;

public class loginActivity extends AppCompatActivity {
    FirebaseAuth auth;
    EditText Email,password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       // Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        //getActionBar().setTitle("Register");
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        auth = FirebaseAuth.getInstance();

         Email = findViewById(R.id.Email);
         password = findViewById(R.id.Password);
         btn_login = findViewById(R.id.btn_login);
         btn_login.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String txt_email = Email.getText().toString();
                 String txt_password = password.getText().toString();


             }
         });
    }
}