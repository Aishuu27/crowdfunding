package com.example.crowdfunding.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crowdfunding.R;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerview;
    private String sname[]={"National Mission For Sustainable Agriculture (NMSA)","Pradhan Mantri Krishi Sinchai Yojana (PMKSY)","Paramparagat Krishi Vikas Yojana (PKVY)",
    "Pradhan Mantri Fasal Bima Yojana (PMFBY)","Gramin Bhandaran Yojna","Livestock insurance Scheme","Scheme on Fisheries Training and Extension",
    "National Scheme on Welfare of Fishermen","Micro Irrigation Fund (MIF"};

    private String sdesc[]={"National Mission for Sustainable Agriculture (NMSA) has been formulated for enhancing agricultural productivity especially in rainfed areas focusing on integrated farming, water use efficiency, soil health management and synergizing resource conservation.",
    "Har Khet ko Pani Prime Minister Krishi Sinchayee Yojana Government of India is committed to accord high priority to water conservation and its management. To this effect Pradhan Mantri Krishi Sinchayee Yojana (PMKSY) has been formulated with the vision of extending the coverage of irrigation 'Har Khet ko pani' and improving water use efficiency 'More crop per drop' in a focused manner with end to end solution on various activities.",
    "The Paramparagat Krishi Vikas Yojana (PKVY), an initiative to promote organic farming in the country, was launched by the NDA government in 2015.According to the scheme, farmers will be encouraged to form groups or clusters and take to organic farming methods over large areas in the country.",
    "Pradhan Mantri Fasal Bima Yojana (PMFBY) is the government sponsored crop insurance scheme that integrates multiple stakeholders on a single platform.",
    "Create scientific storage capacity with allied facilities in rural areas.",
    "This scheme aims to provide protection mechanism to the farmers and cattle rearers against any eventual loss of their animals due to death and to demonstrate the benefit of the insurance of livestock to the people and popularize it with the ultimate goal of attaining qualitative improvement in livestock and their products.",
    "It was launched to provide training for fishery sector so as to assist in undertaking fisheries extension programmes effectively.",
    "This scheme was launched to provide financial assistance to fishers for construction of house, community hall for recreation and common working place. It also aims to install tube-wells for drinking water and assistance during lean period through saving cum relief component.",
    "The government approved a dedicated Rs5,000 crore fund to bring more land area under micro-irrigation as part of its objective to boost agriculture production and farmers income.The fund has been set up under NABARD, which will provide this amount to states on concessional rate of interest to promote micro-irrigation, which currently has a coverage of only 10 million hectares as against the potential of 70 million hectares."};

    //int[] simage ={R.mipmap.logo_round};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerview =  (RecyclerView) root.findViewById(R.id.scheme_view);

        RecyclerView.LayoutManager layoutmanager=new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutmanager);

        MyAdapter myadapter = new MyAdapter(getActivity(),sname,sdesc);
        recyclerview.setAdapter(myadapter);


        return root;
    }
}
