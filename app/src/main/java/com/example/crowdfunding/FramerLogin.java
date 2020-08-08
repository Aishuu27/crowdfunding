package com.example.crowdfunding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class FramerLogin extends AppCompatActivity {
    EditText username,password;
    String farmer_username,farmer_password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framer_login);

        button=findViewById(R.id.farmer_submit);
        username=findViewById(R.id.farmer_phone);
        password=findViewById(R.id.farmer_password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                farmer_username=username.getText().toString();
                farmer_password=password.getText().toString();
                if((farmer_username.equals("8762216798")&& farmer_password.equals("abcd"))||(farmer_username.equals("9740855985")&&farmer_password.equals("suraj123"))||(farmer_username.equals("8884110104")&&farmer_password.equals("sonu123"))){
                    Intent i= new Intent(FramerLogin.this, AfterFarmerLogin.class);
                startActivity(i);
                }
               else{
                    Toast.makeText(getApplicationContext(),"Invalid User",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
