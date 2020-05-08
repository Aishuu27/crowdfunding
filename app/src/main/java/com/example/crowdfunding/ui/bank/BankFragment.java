package com.example.crowdfunding.ui.bank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import com.example.crowdfunding.R;
import com.example.crowdfunding.ui.sendmoney.SendMoney;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class BankFragment extends Fragment {

  BottomNavigationView bottom_navigation;
   /* final Fragment fragment1 = new SendMoney();
    final FragmentManager fm =getActivity().getSupportFragmentManager();
    Fragment active = fragment1;*/

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_bank, container, false);
       //bottom_navigation=(BottomNavigationView) root.findViewById(R.id.bottomnavigation);


        return root;
    }
   /* private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){
                case R.id.send_money:
                    fm.beginTransaction().hide(active).show(fragment1).commit();
                    active=fragment1;
                    return true;
            }
            return false;
        }
    };*/

}
