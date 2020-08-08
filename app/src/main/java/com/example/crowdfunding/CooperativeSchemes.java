package com.example.crowdfunding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CooperativeSchemes extends AppCompatActivity {
    Button scheme_button,apply_button;
    String crop_type;
    TextView kharif_text,Rabi_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cooperative_schemes);

        scheme_button=findViewById(R.id.scheme_button);
        kharif_text=findViewById(R.id.Kharif_scheme);
        Rabi_text=findViewById(R.id.Rabi_scheme);
        apply_button=findViewById(R.id.apply_scheme);

        Spinner spinner = findViewById(R.id.crop_type);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.CropType, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                crop_type=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        scheme_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(crop_type.equalsIgnoreCase("Kharif Crop")){
                    kharif_text.setVisibility(View.VISIBLE);
                    Rabi_text.setVisibility(View.INVISIBLE);
                }
                else if(crop_type.equalsIgnoreCase("Rabi crop")){
                    Rabi_text.setVisibility(View.VISIBLE);
                    kharif_text.setVisibility(View.INVISIBLE);
                }
                else if(crop_type.equalsIgnoreCase("Choose crop Type ")){
                    kharif_text.setVisibility(View.INVISIBLE);
                    Rabi_text.setVisibility(View.INVISIBLE);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Choose correct Option",Toast.LENGTH_SHORT).show();
                }
            }
        });
        apply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"Successfully Submitted!! We will Get Back To You!! ",Toast.LENGTH_LONG).show();
            }
        });
    }
}
