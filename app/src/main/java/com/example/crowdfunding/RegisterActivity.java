package com.example.crowdfunding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    EditText phone,password,reenter_password;
    Button register;

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Phone="phoneKey";
    public static final String Password="Passkey";
     String  repass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        phone=findViewById(R.id.phone);
        password=findViewById(R.id.password);
        reenter_password=findViewById(R.id.reenter);

        register=findViewById(R.id.register);
        sharedpreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

      register.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             String phone_string=phone.getText().toString();
             String password_string=password.getText().toString();
             repass=reenter_password.getText().toString();

             SharedPreferences.Editor editor=sharedpreferences.edit();
             editor.putString(Phone,phone_string);
             editor.putString(Password,password_string);
             if(Password.equals(repass)){
                  editor.commit();
                  Toast.makeText(getApplicationContext(),"Thank you for registering",Toast.LENGTH_LONG).show();
              }
              else{
                  Toast.makeText(getApplicationContext(),"Password do not match",Toast.LENGTH_LONG).show();
              }
          }
      });
    }

}
