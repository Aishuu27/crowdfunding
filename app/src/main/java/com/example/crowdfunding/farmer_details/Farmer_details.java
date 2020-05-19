package com.example.crowdfunding.farmer_details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.crowdfunding.R;

public class Farmer_details extends AppCompatActivity {

    RecyclerView recyclerview;
    String st1[]={"Name","Name","Name","Name","Name","Name","Name","Name","Name"};
    String st2[]={"Age","Age","Age","Age","Age","Age","Age","Age","Age"};
    String st3[]={"place","place","place","place","place","place","place","place","place"};

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
