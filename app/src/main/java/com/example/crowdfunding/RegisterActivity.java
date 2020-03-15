package com.example.crowdfunding;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }
    public void message(View V){
        Toast.makeText(getApplicationContext(),"Thank You For Registering",Toast.LENGTH_SHORT).show();
    }
}
