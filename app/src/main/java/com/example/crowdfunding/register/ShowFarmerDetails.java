package com.example.crowdfunding.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.crowdfunding.R;

public class ShowFarmerDetails extends AppCompatActivity {
    MyDatabaseHelper databaseHelper;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_farmer_details);
        text=findViewById(R.id.farmer_details);
        printDB();
    }
    public void printDB(){
        String dbString = databaseHelper.databaseToString();
        text.setText(dbString);
    }
}