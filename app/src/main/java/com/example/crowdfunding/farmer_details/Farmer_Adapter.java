package com.example.crowdfunding.farmer_details;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class Farmer_Adapter extends RecyclerView.Adapter<Farmer_Adapter.MyViewHolder> {

    Context context;
    String data1[],data2[],data3[];
    public Farmer_Adapter(Context ct,String st1[],String st2[],String st3[]){
        context=ct;
        data1=st1;
        data2=st2;
        data3=st3;
    }
    @NonNull
    @Override
    public Farmer_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.farmerdetail_row, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Farmer_Adapter.MyViewHolder holder, final int position) {
        holder.name.setText(data1[position]);
        holder.age.setText(data2[position]);
        holder.place.setText(data3[position]);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,age,place;
        LinearLayout mainlayout;
        public MyViewHolder(@NonNull View v) {
            super(v);
            name=v.findViewById(R.id.farmer_name);
            age=v.findViewById(R.id.farmer_age);
            place=v.findViewById(R.id.farmer_place);
            mainlayout = itemView.findViewById(R.id.farmer_main);
        }

        }

}
