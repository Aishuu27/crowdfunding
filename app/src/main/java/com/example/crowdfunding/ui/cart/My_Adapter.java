package com.example.crowdfunding.ui.cart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

class My_adapter extends RecyclerView.Adapter<My_adapter.MyViewHolder> {

    Context c;
    String data1[];
    int images[];
    public int quantity;
    String text;

    public My_adapter(Context c,String st1[], int image[]) {
        this.c=c;
        data1 = st1;
        images = image;
    }


    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_row,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.title.setText(data1[position]);
        holder.image.setImageResource(images[position]);
        holder.t1.setText("0 kg");
        holder.button1.setOnClickListener(new View.OnClickListener() {

            @Override
                public void onClick(View view) {
                    quantity = quantity + 1;
                    text = quantity + "kg";
                    holder.t1.setText(text);
                }
            });
        holder.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quantity==0){
                    quantity=0;
                    text = quantity + "kg";
                    holder.t1.setText(text);
                }
                else {
                    quantity = quantity - 1;
                    text = quantity + "kg";
                    holder.t1.setText(text);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        ImageView image;
        Button button1,button2;
        TextView t1;



        public MyViewHolder(@NonNull View v) {
            super(v);
            title = v.findViewById(R.id.title);
            image = v.findViewById(R.id.image);
            button1=v.findViewById(R.id.increment_button);
            button2=v.findViewById(R.id.decrement_button);
            t1=v.findViewById(R.id.quantity);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
