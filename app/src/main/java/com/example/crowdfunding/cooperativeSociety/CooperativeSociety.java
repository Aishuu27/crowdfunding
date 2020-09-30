package com.example.crowdfunding.cooperativeSociety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.crowdfunding.AfterSplash;
import com.example.crowdfunding.R;
import com.example.crowdfunding.register.RegisterActivity;
import com.example.crowdfunding.farmer_details.Farmer_details;

public class CooperativeSociety extends AppCompatActivity {
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
                Intent i=new Intent(CooperativeSociety.this, CooperativeSchemes.class);
                startActivity(i);
            }
        });

        insurance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent insurance_intent=new Intent(CooperativeSociety.this, CooperativeInsurance.class);
                    startActivity(insurance_intent);
            }
        });
        farmer_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent details_intent=new Intent(CooperativeSociety.this, Farmer_details.class) ;
               startActivity(details_intent);
            }
        });
        crop_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent crop_intent=new Intent(CooperativeSociety.this, CropDetailsCooperative.class);
                startActivity(crop_intent);
            }
        });
        register_farmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register_intent=new Intent(CooperativeSociety.this, RegisterActivity.class);
                startActivity(register_intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent i= new Intent(CooperativeSociety.this, AfterSplash.class);
        startActivity(i);

    }
}
