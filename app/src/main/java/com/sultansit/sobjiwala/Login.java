package com.sultansit.sobjiwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button b_login, b_goto_regi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b_login = (Button) findViewById(R.id.btnLoginID);
        b_goto_regi = (Button) findViewById(R.id.goToRegisterButtonID);

        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,Home.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"You are now logged in",Toast.LENGTH_SHORT).show();
            }
        });

        b_goto_regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,Register.class);
                startActivity(i);
            }
        });
    }
}
