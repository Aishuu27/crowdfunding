package com.example.crowdfunding.ui.sendmoney;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.crowdfunding.R;

public class SendMoney extends Fragment {

    final Fragment fragment1=new SendMoney();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_sendmoney, container, false);
        return root;
    }

}

