package com.example.crowdfunding.ui.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context c;
    String data1[];
    String data2[];
    String url[];
    String colors[];
    RecyclerView recyclerView;
   // int images[];

    public MyAdapter(Context c,String sname[], String sdesc[],String surl[]) {
        this.c=c;
        data1 = sname;
        data2=sdesc;
        url=surl;

       // images = simage;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.scheme_row,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.title.setText(data1[position]);
        holder.description.setText(data2[position]);
        holder.read_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(c, "Beginning game " , Toast.LENGTH_SHORT);
                String parse_url=url[position];
                Intent i=new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(parse_url));
                 c.startActivity(i);
            }
        } );
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title,description;
        ImageView image;
        ConstraintLayout cardview;
        ConstraintLayout card_design;
        Button read_button;


        public MyViewHolder(@NonNull View v) {
            super(v);
            title = v.findViewById(R.id.scheme_title);
            description= v.findViewById(R.id.scheme_description);
            //image = v.findViewById(R.id.scheme_image);
            read_button=v.findViewById(R.id.readmore);
            cardview=itemView.findViewById(R.id.schemelayout);
            card_design= itemView.findViewById(R.id.design);
        }

        @Override
        public void onClick(View view) {

        }
    }
}

