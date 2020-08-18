package com.example.crowdfunding.register;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.crowdfunding.LoginActivity;
import com.example.crowdfunding.R;

public class RegisterActivity extends AppCompatActivity {


    EditText password,reenter_password;
    Button register;


    String entered_password,reentered_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        password=findViewById(R.id.password);
        reenter_password=findViewById(R.id.reenter);

        register=findViewById(R.id.register);


      register.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             entered_password=password.getText().toString();
              reentered_password=reenter_password.getText().toString();
             if(entered_password.equals(reentered_password)){
                  //editor.commit();
                  Toast.makeText(getApplicationContext(),"Thank you for registering",Toast.LENGTH_LONG).show();
                  Intent i =new Intent(RegisterActivity.this, LoginActivity.class);
                  startActivity(i);
              }
              else{
                  Toast.makeText(getApplicationContext(),"Password do not match",Toast.LENGTH_LONG).show();
              }
          }
      });
    }

}
