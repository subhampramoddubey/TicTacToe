package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;

import pl.droidsonroids.gif.GifImageView;

public class SplashScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        GifImageView splashScreenLogo = findViewById(R.id.imageView);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(SplashScreen.this,MainActivity.class);

                Pair[] pairs =new Pair[1];
                pairs[0] = new Pair<>(splashScreenLogo,"LogoImage");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SplashScreen.this,pairs);

                startActivity(i,options.toBundle());
                finish();
            }
        },3000);




    }
}