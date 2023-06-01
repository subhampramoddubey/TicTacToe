package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class AiChooseSymbolActivity extends AppCompatActivity {


    private ImageView BackBtn , CrossImg , CrossRadioImg , CircleImg , CircleRadioImg;
    private Button ContinueBtn;

    int PICK_SIDE ;
    private String playerName;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ai_choose_symbol);

        playerName = getIntent().getStringExtra("p1");


        BackBtn= (ImageView) findViewById(R.id.ai_pick_side_back_btn);
        CrossImg= (ImageView) findViewById(R.id.ai_pick_side_cross_img);
        CircleImg= (ImageView) findViewById(R.id.ai_pick_side_circle_img);
        CrossRadioImg= (ImageView) findViewById(R.id.ai_pick_side_cross_radio);
        CircleRadioImg= (ImageView) findViewById(R.id.ai_pick_side_circle_radio);

        ContinueBtn = (Button) findViewById(R.id.ai_pick_side_continue_btn);

        // CrossRadioImg.setOnTouchListener(this);
        CrossRadioImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PICK_SIDE = 0;
                CrossRadioImg.setImageResource(R.drawable.radio_button_checked);
                CircleRadioImg.setImageResource(R.drawable.radio_button_unchecked);
                CircleImg.setAlpha(0.3f);
                CrossImg.setAlpha(1.0f);
                //Intent intent = new Intent(.this,Ch.class);
                // startActivity(intent);
            }
        });

        // CircleRadioImg.setOnTouchListener(this);
        CircleRadioImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                PICK_SIDE= 1;
                CircleRadioImg.setImageResource(R.drawable.radio_button_checked);
                CrossRadioImg.setImageResource(R.drawable.radio_button_unchecked);
                CrossImg.setAlpha(0.3f);
                CircleImg.setAlpha(1.0f);

                //Intent intent = new Intent(.this,Ch.class);
                // startActivity(intent);
            }
        });

        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                onBackPressed();
                //Intent intent = new Intent(.this,Ch.class);
                // startActivity(intent);
            }
        });

        ContinueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(    AiChooseSymbolActivity.this,AiGameActivity.class);
                intent.putExtra("p1",playerName);
                intent.putExtra("ps",PICK_SIDE);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}