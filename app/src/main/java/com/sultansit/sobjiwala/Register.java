package com.sultansit.sobjiwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    Button b_regi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        b_regi = (Button) findViewById(R.id.registerButtonID);

        b_regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Register.this,Home.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Congratulation!!\nAccount created succesfully",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
