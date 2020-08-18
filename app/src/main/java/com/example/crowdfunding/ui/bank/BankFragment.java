package com.example.crowdfunding.ui.bank;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import com.example.crowdfunding.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class BankFragment extends Fragment {

    private Button checkBalanecBtn, addBankDetailsBtn, transactMoneyBtn;
    AlertDialog dialog1;
    EditText editText1;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_bank, container, false);
        checkBalanecBtn = (Button) root.findViewById(R.id.CheckBalance);
        checkBalanecBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity().getApplicationContext(),
                        "Sorry!, Currently you have 0 Balance", Toast.LENGTH_LONG).show();
            }
        });
        addBankDetailsBtn = (Button) root.findViewById(R.id.AddBankAccount);
        addBankDetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent blockchainIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://localhost/FarmFund/code1/project_eth/node_modules/bank.html"));
                startActivity(blockchainIntent);


            }
        });
        dialog1 = new AlertDialog.Builder(getActivity()).create();
        editText1 = new EditText(getActivity());
        dialog1.setTitle("Enter the amount for transaction:");
        dialog1.setView(editText1);
        dialog1.setButton(DialogInterface.BUTTON_POSITIVE, "Confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity().getApplicationContext(),
                        "Your transcation details will be processed soon!", Toast.LENGTH_LONG).show();

            }
        });
        transactMoneyBtn = (Button) root.findViewById(R.id.TransactMoney);
        transactMoneyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog1.show();

            }
        });


        return root;
    }

}
