package com.example.crowdfunding.cropdetails_cooperative;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.crowdfunding.R;
import com.example.crowdfunding.farmer_details.Farmer_Adapter;

public class CropDetails_cooperative extends AppCompatActivity {

    RecyclerView recyclerview;
    String st1[]={"Name","Name","Name","Name","Name","Name","Name","Name","Name"};
    String st2[]={"Quantity Available","Quantity Available","Quantity Available","Quantity Available","Quantity Available","Quantity Available","Quantity Available","Quantity Available","Quantity Available"};
    String st3[]={"Price","Price","Price","Price","Price","Price","Price","Price","Price"};


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
