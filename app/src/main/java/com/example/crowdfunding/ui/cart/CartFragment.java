package com.example.crowdfunding.ui.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.crowdfunding.R;


public class CartFragment extends Fragment {

    private RecyclerView recyclerview;

    private String st1[]={"Potato","Tomato","Onion","Carrot","Beans","Brinjal","Cucumber","Raddish","Spinach","Coriender Leaves","BeetRoot","Chillies","Ladys Finger"};
    int[] image ={R.drawable.potato,R.drawable.tomato,R.drawable.onion,R.drawable.carrot,R.drawable.beans,R.drawable.brinjal,R.drawable.cucumber,R.drawable.raddish,R.drawable.spinach,R.drawable.coriender,R.drawable.beetroot,R.drawable.chillies,R.drawable.layds_finger};


    public static CartFragment newInstance(){
        return new CartFragment();
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_cart,null);

        recyclerview =  (RecyclerView) view.findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutmanager=new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutmanager);

        My_adapter myadapter = new My_adapter(getActivity(),st1,image);
        recyclerview.setAdapter(myadapter);

        return view;
    }

}
