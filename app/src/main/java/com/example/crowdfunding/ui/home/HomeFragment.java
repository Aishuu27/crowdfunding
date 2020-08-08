package com.example.crowdfunding.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerview;
    private String sname[];


    private String sdesc[];

    private String surl[]={"https://vikaspedia.in/agriculture/policies-and-schemes/crops-related/krishi-unnati-yojana/national-mission-for-sustainable-agriculture-1/national-mission-for-sustainable-agriculture",
    "https://pmksy.gov.in/","https://pgsindia-ncof.gov.in/pkvy/index.aspx","https://pmfby.gov.in/","https://pib.gov.in/newsite/mberel.aspx?relid=96201","https://vikaspedia.in/agriculture/agri-insurance/livestock-insurance",
            "http://dahd.nic.in/related-links/centrally-sponsored-scheme-fisheries-training-and-extension","http://dahd.nic.in/related-links/centrally-sponsored-national-scheme-welfare-fishermen",
            "https://www.manifestias.com/2019/10/15/micro-irrigation-fund-mif/"};



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_scheme, container, false);

        recyclerview =  (RecyclerView) root.findViewById(R.id.scheme_view);

        RecyclerView.LayoutManager layoutmanager=new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutmanager);
        sname=getActivity().getResources().getStringArray(R.array.schemes);
        sdesc=getActivity().getResources().getStringArray(R.array.scheme_description);
        MyAdapter myadapter = new MyAdapter(getActivity(),sname,sdesc,surl);
        recyclerview.setAdapter(myadapter);


        return root;
    }
}
