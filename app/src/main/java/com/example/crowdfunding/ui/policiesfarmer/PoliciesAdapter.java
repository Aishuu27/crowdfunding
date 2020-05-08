package com.example.crowdfunding.ui.policiesfarmer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class PoliciesAdapter extends RecyclerView.Adapter<PoliciesAdapter.MyViewHolder> {
    Context c;
    String data1[];
    String data2[];
    // int images[];

    public PoliciesAdapter(Context c, String sname[], String sdesc[]) {
        this.c=c;
        data1 = sname;
        data2=sdesc;
        // images = simage;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.policies_row_farmer,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
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
            title = v.findViewById(R.id.scheme_title);
            description= v.findViewById(R.id.scheme_description);
            //image = v.findViewById(R.id.scheme_image);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
