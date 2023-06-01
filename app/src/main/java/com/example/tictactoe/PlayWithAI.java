package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class PlayWithAI extends AppCompatActivity {

    Button playbutton;
    TextInputEditText player1name;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_with_ai);



        player1name = findViewById(R.id.YourPlayerName);
        playbutton = findViewById(R.id.playwithAI);

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String playerOne = player1name.getText().toString().trim();
                if (playerOne.isEmpty()) {
                    player1name.setError("Enter Name");
                    Toast.makeText(getApplicationContext(), "Enter Player Name", Toast.LENGTH_SHORT).show();

                } else {

                    Intent intent = new Intent(PlayWithAI.this, AiChooseSymbolActivity.class);
                    intent.putExtra("p1", playerOne);
                    startActivity(intent);
                }
            }
        });


    }


}