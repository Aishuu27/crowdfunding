package com.example.crowdfunding.cooperativeSociety;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.crowdfunding.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;

import java.util.Objects;

public class CooperativeInsurance extends AppCompatActivity {
    private ImageView  mImageView;
    Button claim_insurance,mButtonUpload;
    FloatingActionButton chooseImage;
    private ProgressBar mProgressBar;

    private Uri mImageUri;
    private StorageReference mStorageRef;
    private DatabaseReference mDataBaseRef;
    private StorageTask muploadTask;
    private static final int PICK_IMAGE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cooperative_insurance);

        mImageView=findViewById(R.id.upload_image);
        chooseImage =findViewById(R.id.fab);
        claim_insurance=findViewById(R.id.apply);
        mButtonUpload = findViewById(R.id.upload_button);
        mProgressBar = findViewById(R.id.progress_bar);
        mStorageRef= FirebaseStorage.getInstance().getReference("uploads");
        mDataBaseRef= FirebaseDatabase.getInstance().getReference("uploads");


        claim_insurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"You Have Successfully Claimed Insurance!! We Will Get BAck To You Soon!!",Toast.LENGTH_LONG).show();
            }
        });
        chooseImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                upload_image(view);
            }
        });
        mButtonUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(muploadTask!=null && muploadTask.isInProgress()){
                    Toast.makeText(CooperativeInsurance.this,"Upload In Progress",Toast.LENGTH_LONG).show();
                }else{
                    uploadFile();
                }

            }
        });
    }

    public void upload_image(View v){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data ) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode==RESULT_OK &&
                data!=null && data.getData()!=null ){
            mImageUri= data.getData();
            mImageView.setImageURI(mImageUri);
        }
    }
    private String getFileExtension(Uri uri){
        ContentResolver cr= getContentResolver();
        MimeTypeMap mime=MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cr.getType(uri));
    }
    private void uploadFile(){
        if(mImageUri!=null){
            StorageReference fileReference= mStorageRef.child(System.currentTimeMillis()+"."+getFileExtension(mImageUri));
            muploadTask= fileReference.putFile(mImageUri)
                    .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            Handler handler=new Handler();
                            handler.postDelayed(new Runnable(){
                                @Override
                                public void run(){
                                    mProgressBar.setProgress(0);
                                }
                            },500);
                            Toast.makeText(CooperativeInsurance.this,"Upload successfull",Toast.LENGTH_LONG).show();
                            Upload upload= new Upload(Objects.requireNonNull(Objects.requireNonNull(taskSnapshot.getMetadata()).getReference()).getDownloadUrl().toString());
                            String uploadId=mDataBaseRef.push().getKey();
                            mDataBaseRef.child(uploadId).setValue(upload);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(CooperativeInsurance.this,e.getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                            double progress= (100.0 *taskSnapshot.getBytesTransferred()/ taskSnapshot.getTotalByteCount());
                            mProgressBar.setProgress((int) progress);
                        }
                    });
        }else{
            Toast.makeText(CooperativeInsurance.this,"No file selected",Toast.LENGTH_LONG).show();
        }
    }
}
