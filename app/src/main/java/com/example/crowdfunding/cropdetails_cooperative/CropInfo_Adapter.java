package com.example.crowdfunding.cropdetails_cooperative;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class CropInfo_Adapter extends RecyclerView.Adapter< CropInfo_Adapter.MyViewHolder> {
    Context context;
    String data1[],data2[],data3[];

    public CropInfo_Adapter(Context ct, String st1[], String st2[], String st3[]){
        context=ct;
        data1=st1;
        data2=st2;
        data3=st3;
    }
    @NonNull
    @Override
    public CropInfo_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.cropinfo_row, parent, false);
       return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CropInfo_Adapter.MyViewHolder holder, int position) {
        holder.name.setText(data1[position]);
        holder.quantity.setText(data2[position]);
        holder.price.setText(data3[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,quantity,price;
        ConstraintLayout  main;
        public MyViewHolder(@NonNull View v) {
            super(v);
            name=v.findViewById(R.id.crop_name);
            quantity=v.findViewById(R.id.available_quantity);
            price=v.findViewById(R.id.crop_price);
            main=itemView.findViewById(R.id.cropinfo_main);

        }
    }
}
