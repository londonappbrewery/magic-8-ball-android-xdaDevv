package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask_Button;
        ask_Button = (Button) findViewById(R.id.ask_Button);

        final ImageView psoudoEight_Ball = (ImageView) findViewById(R.id.eight_Ball_image);

        final int[] eight__Ball_ARRAY = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        ask_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random psoudoRandom_NAME = new Random();
                int psoudoRandom_RESULTS = (psoudoRandom_NAME.nextInt(5));
                psoudoEight_Ball.setImageResource(eight__Ball_ARRAY[psoudoRandom_RESULTS]);

            }
        });


    }
}
