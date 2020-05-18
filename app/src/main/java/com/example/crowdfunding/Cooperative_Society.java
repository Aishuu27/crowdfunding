package com.example.crowdfunding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        register_farmer=findViewById(R.id.crop_details);


        scheme_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    

}
