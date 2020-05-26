package com.example.crowdfunding.cropdetails_cooperative;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.crowdfunding.R;
import com.example.crowdfunding.farmer_details.Farmer_Adapter;

public class CropDetails_cooperative extends AppCompatActivity {

    RecyclerView recyclerview;
    String st1[]={"Potato","Tomato","Onion","Carrot","Beans","Brinjal","Cucumber","Raddish","Spinach","Coriander Leaves","BeetRoot","Chillies","Ladys Finger"};
    String st2[]={"10kg Available","25kg Available","30kg Available","12kg Available","20kg Available","30kg Available","50kg Available","20kg Available","20kg Available","20kg Available","20kg Available","20kg Available","50kg Available","40kg Available"};
    String st3[]={"50.00/kg","15.00/kg","25.00/kg","30.00/kg","40.00/kg","20.00/kg","20.00/kg","50.00/kg","15.00/kg","25.00/kg","30.00/kg","40.00/kg","20.00/kg"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cropdetails_cooperative);
        recyclerview = (RecyclerView) findViewById(R.id.cropinfo_recyclerview);
        CropInfo_Adapter cadapter = new  CropInfo_Adapter(this, st1, st2,st3);

        recyclerview.setAdapter(cadapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }
}
