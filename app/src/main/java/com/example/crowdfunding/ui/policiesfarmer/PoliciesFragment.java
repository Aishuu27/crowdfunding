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
    private String fpolicies[] ;

    private String policy_desc[] ;



    //int[] simage ={R.mipmap.logo_round};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_policies_farmer, container, false);

        recyclerview = (RecyclerView) root.findViewById(R.id.scheme_view);

        RecyclerView.LayoutManager layoutmanager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutmanager);
        fpolicies=getActivity().getResources().getStringArray(R.array.farmer_policies);
        policy_desc=getActivity().getResources().getStringArray(R.array.policy_description);

        PoliciesAdapter myadapter = new PoliciesAdapter(getActivity(), fpolicies, policy_desc);
        recyclerview.setAdapter(myadapter);


        return root;
    }

}
