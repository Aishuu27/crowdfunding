package com.example.crowdfunding.ui.insurancefarmer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class InsuranceFragment extends Fragment {
    private RecyclerView recyclerview;
    int[] image ={R.drawable.insurance_crop,R.drawable.insurance_weather,R.drawable.insurance_power,R.drawable.insurance_rain,R.drawable.insurance_mango,R.drawable.insurance_plant,
            R.drawable.insurance_grapes,R.drawable.insurance_potato,R.drawable.insurance_wheat,R.drawable.insurance_pulp,R.drawable.insurance_rubber,R.drawable.insurance_coconut,R.drawable.insurance_rabi};
    private String sname[] = {"Crop Insurance", "Weather based Insurance", "Power Failure Insurance",
            "Rainfall Insurance/Varsha Bhima", "Mango  Insurance", "Plant Insurance",
            "Grapes Insurance", "Potato Insurance","Wheat  Insurance","Pulpwood Tree Insurance",
            "Rubber Insurance","Coconut Insurance","Rabi Weather Insurance"};

    private String sdesc[] = {"Crop Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Weather based Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Power Failure Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Rainfall Insurance/Varsha Bhima is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Mango  Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Plant Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Grapes Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Potato Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Wheat  Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Pulpwood Tree Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Rubber Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Coconut Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities",
            "Rabi Weather Insurance is purchased by agricutural producers,and subsidized by the federal government,to protect against either the loss of their crops due to natural diaster such as hail,drought, and floods, or the loss of revenue due to decline in the prices of agricultural commodities"};

    //int[] simage ={R.mipmap.logo_round};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_insurance_farmer, container, false);

        recyclerview = (RecyclerView) root.findViewById(R.id.scheme_view);

        RecyclerView.LayoutManager layoutmanager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutmanager);

        InsuranceAdapter myadapter = new InsuranceAdapter(getActivity(), image,sname, sdesc);
        recyclerview.setAdapter(myadapter);


        return root;
    }
}
