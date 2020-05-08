package com.example.crowdfunding;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, AfterSplash.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }


}
