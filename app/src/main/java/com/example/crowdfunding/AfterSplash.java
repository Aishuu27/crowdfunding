package com.example.crowdfunding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

public class AfterSplash extends AppCompatActivity {

   public String  role,lan;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_splash);
        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Role, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                role=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Spinner spinner1 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.Language, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                lan=adapterView.getItemAtPosition(i).toString();
                String languageToLoad = null;
                if(lan.equalsIgnoreCase("kannada")){
                    languageToLoad="kn";
                }
                else if(lan.equals("English")){
                    languageToLoad="en";
                }
                if(languageToLoad!=null) {
                    Locale locale = new Locale(languageToLoad);
                    Locale.setDefault(locale);
                    Configuration config = new Configuration();
                    config.locale = locale;
                    getBaseContext().getResources().updateConfiguration(config,
                            getBaseContext().getResources().getDisplayMetrics());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        submit=findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(role.equalsIgnoreCase("funder")){
                    Intent intent= new Intent(AfterSplash.this,LoginActivity.class);
                    startActivity(intent);
                }
                else if(role.equalsIgnoreCase("farmer")){
                    Intent intent =new Intent(AfterSplash.this,Framer_login.class);
                    startActivity(intent);
                }
                else if(role.equalsIgnoreCase("Co-Operative society")){
                    Intent intent=new Intent(AfterSplash.this,Cooperative_Society.class );
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Choose correct Option",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
