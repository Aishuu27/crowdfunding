package com.example.crowdfunding.ui.insurancefarmer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class InsuranceAdapter extends RecyclerView.Adapter<InsuranceAdapter.MyViewHolder> {
    Context c;
    int images[];
    String data1[];
    String data2[];
    // int images[];

    public InsuranceAdapter(Context c, int image[], String sname[], String sdesc[]) {
        this.c=c;
        images=image;
        data1 = sname;
        data2=sdesc;
        // images = simage;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.insurance_row_farmer,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.image.setImageResource(images[position]);
        holder.title.setText(data1[position]);
        holder.description.setText(data2[position]);
        //holder.image.setImageResource(images[0]);

    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title,description;
        ImageView image;


        public MyViewHolder(@NonNull View v) {
            super(v);
            image = v.findViewById(R.id.imageView3);
            title = v.findViewById(R.id.scheme_title);
            description= v.findViewById(R.id.scheme_description);
            //image = v.findViewById(R.id.scheme_image);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
