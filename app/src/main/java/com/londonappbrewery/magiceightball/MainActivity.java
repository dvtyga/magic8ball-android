package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askMeButton = findViewById(R.id.button_askMe);

        final ImageView magic8Ball = findViewById(R.id.image_magic8Ball);

        final int[] magic8Balls = {
               R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        askMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("magicball", "clicking!");

                Random rand = new Random();
                int randomNumber = rand.nextInt(5);

                magic8Ball.setImageResource(magic8Balls[randomNumber]);
            }
        });



    }
}
