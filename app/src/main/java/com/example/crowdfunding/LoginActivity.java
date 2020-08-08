package com.example.crowdfunding;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class LoginActivity extends AppCompatActivity {
    EditText t1,t2;
    private String username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);
        t1=findViewById(R.id.phone);
        t2=findViewById(R.id.password);
    }
   public void b1(View V){
        username=t1.getText().toString();
        password=t2.getText().toString();
        if((username.equals("8762216798")&& password.equals("abc"))||(username.equals("9740855985")&&password.equals("suraj123"))||(username.equals("8884110104")&& password.equals("sonu123"))||(username.equals("9449204019")&&password.equals("xyz"))){
            Intent i= new Intent(LoginActivity.this, AfterLogin.class);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(),"Invalid User",Toast.LENGTH_SHORT).show();
        }
   }
    public void register(View v){
        Intent i1=new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(i1);
    }
}
