package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView leftDice, rightDice;
    final int [] diceeArray = {
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = findViewById(R.id.rollButton);
        leftDice = findViewById(R.id.image_leftDice);
        rightDice = findViewById(R.id.image_rightDice);


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random numberRandom = new Random();
                int number = numberRandom.nextInt(6);
                leftDice.setImageResource(diceeArray[number]);
                int number1 = numberRandom.nextInt(6);
                rightDice.setImageResource(diceeArray[number1]);
                Toast.makeText(MainActivity.this, "1°:" + (number + 1) + " 2°:" + (number1 + 1), Toast.LENGTH_SHORT).show();
            }
        });
    }
}