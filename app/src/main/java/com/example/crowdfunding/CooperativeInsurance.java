package com.example.crowdfunding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CooperativeInsurance extends AppCompatActivity {
    private ImageView img;
    Button claim_insurance;
     private static final int REQUEST_IMAGE_CAPTURE=101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cooperative_insurance);
        img=findViewById(R.id.upload_image);
        //capture=findViewById(R.id.upload);
        claim_insurance=findViewById(R.id.apply);

        claim_insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"You Have Successfully Claimed Insurance!! We Will Get BAck To You Soon!!",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void upload_image(View v){
        Intent imageTakeIntent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(imageTakeIntent,REQUEST_IMAGE_CAPTURE);
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data ) {

        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            img.setImageBitmap(imageBitmap);
        }
    }
}
