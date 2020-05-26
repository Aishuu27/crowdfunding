package com.example.crowdfunding.ui.cropinfofarmer;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.crowdfunding.R;

import java.util.ArrayList;

public class SellCropActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private EditText cropET;
    private Button cropBtn;
    private ListView cropsLst;

    private ArrayList<String> crops;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_crop);

        cropET = findViewById(R.id.crop_edit_text);
        cropBtn = findViewById(R.id.sellcrop_btn);
        cropsLst = findViewById(R.id.crops_list);

        crops = SellcropHelper.readData(this);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, crops);
        cropsLst.setAdapter(adapter);

        cropBtn.setOnClickListener(this);
        cropsLst.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.sellcrop_btn:
                String itemEntered = cropET.getText().toString();
                adapter.add(itemEntered);
                cropET.setText("");
                SellcropHelper.writeData(crops, this);
                Toast.makeText(this, "Crop Details Added", Toast.LENGTH_SHORT).show();
                break;
        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        crops.remove(position);
        adapter.notifyDataSetChanged();
        SellcropHelper.writeData(crops, this);
        Toast.makeText(this, "Crop Delete from History", Toast.LENGTH_SHORT).show();

    }
}