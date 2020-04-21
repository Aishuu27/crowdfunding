package com.example.crowdfunding.ui.setting;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.crowdfunding.R;


public class SettingFragment extends Fragment {

    TextView textView1,textView2,textView3;
    AlertDialog dialog1,dialog2,dialog3;
    EditText editText1,editText2,editText3;
    private Button editbutton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_setting, container, false);
        editbutton = (Button) root.findViewById(R.id.buttonToast);
        editbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getActivity().getApplicationContext(),
                        "Click on respective field to edit", Toast.LENGTH_LONG).show();

            }
        });

        textView1 = (TextView) root.findViewById(R.id.textViewUserName);
        dialog1 = new AlertDialog.Builder(getActivity()).create();
        editText1 = new EditText(getActivity());
        dialog1.setTitle("Edit Name");
        dialog1.setView(editText1);
        dialog1.setButton(DialogInterface.BUTTON_POSITIVE, "Save Changes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView1.setText(editText1.getText());
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText(textView1.getText());
                dialog1.show();
            }
        });

        textView2 = (TextView) root.findViewById(R.id.textViewUserPhone);
        dialog2 = new AlertDialog.Builder(getActivity()).create();
        editText2 = new EditText(getActivity());
        dialog2.setTitle("Edit Contact Number");
        dialog2.setView(editText2);
        dialog2.setButton(DialogInterface.BUTTON_POSITIVE, "Save Changes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView2.setText(editText2.getText());
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(textView2.getText());
                dialog2.show();
            }
        });


        textView3 = (TextView) root.findViewById(R.id.textViewUserMail);
        dialog3 = new AlertDialog.Builder(getActivity()).create();
        editText3 = new EditText(getActivity());
        dialog3.setTitle("Edit Mail Id");
        dialog3.setView(editText3);
        dialog3.setButton(DialogInterface.BUTTON_POSITIVE, "Save Changes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView3.setText(editText3.getText());
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText3.setText(textView3.getText());
                dialog3.show();
            }
        });

        return root;

    }
}
