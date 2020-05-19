package com.example.crowdfunding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.crowdfunding.cropdetails_cooperative.CropDetails_cooperative;
import com.example.crowdfunding.farmer_details.Farmer_details;

public class Cooperative_Society extends AppCompatActivity {
    Button scheme_button,insurance_button,farmer_details,crop_details,register_farmer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cooperative_society);
        scheme_button=findViewById(R.id.button_scheme);
        insurance_button=findViewById(R.id.insurance_button);
        farmer_details=findViewById(R.id.farmer_button);
        crop_details=findViewById(R.id.crop_details);
        register_farmer=findViewById(R.id.register_farmer);


        scheme_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Cooperative_Society.this,Cooperative_schemes.class);
                startActivity(i);
            }
        });

        insurance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent insurance_intent=new Intent(Cooperative_Society.this,Cooperative_insurance.class);
                    startActivity(insurance_intent);
            }
        });
        farmer_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent details_intent=new Intent(Cooperative_Society.this, Farmer_details.class) ;
               startActivity(details_intent);
            }
        });
        crop_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crop_intent=new Intent(Cooperative_Society.this, CropDetails_cooperative.class);
                startActivity(crop_intent);
            }
        });
        register_farmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register_intent=new Intent(Cooperative_Society.this,RegisterActivity.class);
                startActivity(register_intent);
            }
        });
    }
}
