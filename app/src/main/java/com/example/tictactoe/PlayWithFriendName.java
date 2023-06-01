package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class PlayWithFriendName extends AppCompatActivity {

    TextInputEditText player1name, player2name;

    Button playbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_with_friend_name);

        player1name = findViewById(R.id.Player1Name);
        player2name = findViewById(R.id.Player2Name);
        playbutton = findViewById(R.id.playwithFriends);

        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String playerOne = player1name.getText().toString().trim();
                String playerTwo = player2name.getText().toString().trim();
                if (playerOne.isEmpty()) {
                    player1name.setError("Enter Name");
                    Toast.makeText(getApplicationContext(), "Enter Player1 Name", Toast.LENGTH_SHORT).show();

                } else if (playerTwo.isEmpty()) {
                    player2name.setError("Enter Name");
                    Toast.makeText(getApplicationContext(), "Enter Player2 Name", Toast.LENGTH_SHORT).show();
                } else {

                    Intent intent = new Intent(PlayWithFriendName.this, ChooseSymbolActivity.class);
                    intent.putExtra("p1", playerOne);
                    intent.putExtra("p2", playerTwo);
                    startActivity(intent);
                }
            }
        });


    }
}