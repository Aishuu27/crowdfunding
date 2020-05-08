package com.example.crowdfunding.ui.policiesfarmer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class PoliciesFragment extends Fragment {
    private RecyclerView recyclerview;
    private String sname[] = {"Policy 1", "Policy 2", "Policy 3",
            "Policy 4", "Policy 5","Policy 6"};

    private String sdesc[] = {"Transactions will be completed only if the user has provided Bank Details",
            "All the necessary documents need to be verified and updated",
            "Requested amount will not be sanctioned if bank details or documents provided are found to be false",
            "Proofs to be submitted for every disaster/crop failure that occured in your land",
            "Any number of crops can be sold in a day in Sell Crop Page",
            "Clear Description of Crops can sell your crop efficiently"};


    //int[] simage ={R.mipmap.logo_round};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_policies_farmer, container, false);

        recyclerview = (RecyclerView) root.findViewById(R.id.scheme_view);

        RecyclerView.LayoutManager layoutmanager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutmanager);

        PoliciesAdapter myadapter = new PoliciesAdapter(getActivity(), sname, sdesc);
        recyclerview.setAdapter(myadapter);


        return root;
    }

}
