package com.example.crowdfunding.register;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.crowdfunding.LoginActivity;
import com.example.crowdfunding.R;

public class RegisterActivity extends AppCompatActivity {


    EditText password,reenter_password,name,mail,address;
    Button register;
    MyDatabaseHelper databaseHelper;
    TextView textView;

    String entered_password,reentered_password,farmerName,farmerMail,farmerAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        name=findViewById(R.id.name);
        mail=findViewById(R.id.email);
        address=findViewById(R.id.postal_address);
        password=findViewById(R.id.password);
        reenter_password=findViewById(R.id.reenter);
        textView=findViewById(R.id.dummy);

        register=findViewById(R.id.register);


      register.setOnClickListener(view -> {
         entered_password=password.getText().toString();
          reentered_password=reenter_password.getText().toString();
          farmerName=name.getText().toString();
          farmerMail=mail.getText().toString();
          farmerAddress=address.getText().toString();
         if(entered_password.equals(reentered_password) && farmerName.length()!=0 && farmerAddress.length()!=0 && farmerMail.length()!=0){
              //editor.commit();
             //textView.setText(farmerName);
             Toast.makeText(getApplicationContext(),"Thank you for registering ",Toast.LENGTH_LONG).show();
            /* FarmerRegister farmer=new FarmerRegister(farmerName);
             databaseHelper.addFarmer(farmer);*/

         }
          else{
              Toast.makeText(getApplicationContext(),"Password do not match",Toast.LENGTH_LONG).show();
          }
      });
    }

}
