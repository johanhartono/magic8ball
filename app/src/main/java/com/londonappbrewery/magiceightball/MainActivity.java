package com.londonappbrewery.magiceightball;

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
        Button askButton;
        askButton = (Button) findViewById(R.id.askButton);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightball);

        final int[] ballArray = {R.drawable.ball12x,R.drawable.ball13x,R.drawable.ball23x,R.drawable.ball32x,R.drawable.ball42x,R.drawable.ball43x};
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Ze Button has been pressed!");
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);
                ballDisplay.setImageResource(ballArray[number]);




            }
        });
    }

}
