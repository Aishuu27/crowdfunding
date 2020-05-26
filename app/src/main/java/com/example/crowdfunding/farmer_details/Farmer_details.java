package com.example.crowdfunding.farmer_details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.crowdfunding.R;

public class Farmer_details extends AppCompatActivity {

    RecyclerView recyclerview;
    String st1[]={"Ravindra Ranagnath","Dipak Vitthalrao","Ganpatrao Appasaheb ","Ajit Gopal Kavathekar","Ram Lal","Mohinder Singh"};
    String st2[]={"47","52","45","43","52","56"};
    String st3[]={"Chikmangaluru","Dharwad","Mandya","Belgaum","Hubli","Udupi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.farmer_details);
        recyclerview = (RecyclerView) findViewById(R.id.farmer_recyclerview);
        Farmer_Adapter fadapter = new  Farmer_Adapter(this, st1, st2,st3);

        recyclerview.setAdapter(fadapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }
}
