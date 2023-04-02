package com.example.mygame;

import static com.example.mygame.R.*;
import static com.example.mygame.R.id.pic1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.Random;

public class MainActivity3 extends AppCompatActivity {
    private Button Rotate;
    private ImageView Pic1, Pic2, Pic3, Pic4;
    private TextView Result, Freespin;
    Random rastgele = new Random();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main3);
        requestShowKeyboardShortcuts();
        Rotate = findViewById(R.id.rotate);
        Pic1 = findViewById(R.id.pic1);
        Pic2 = findViewById(R.id.pic2);
        Pic3 = findViewById(R.id.pic3);
        Pic4 = findViewById(R.id.pic4);
        Result = findViewById(R.id.result);
        Freespin = findViewById(R.id.freespin);

        Integer gelen = getIntent().getExtras().getInt("HAK");
        Freespin.setText("Yours Spin " + gelen);

        Rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int randompic1 = (rastgele.nextInt(4) + 1);
                String path1 = "resim" + String.valueOf(randompic1);
                Pic1.setImageResource(getResources().getIdentifier(path1, "drawable", getPackageName()));
                int randompic2 = (rastgele.nextInt(4) + 1);
                String path2 = "resim" + String.valueOf(randompic2);
                Pic2.setImageResource(getResources().getIdentifier(path2, "drawable", getPackageName()));
                int randompic3 = (rastgele.nextInt(4) + 1);
                String path3 = "resim" + String.valueOf(randompic3);
                Pic3.setImageResource(getResources().getIdentifier(path3, "drawable", getPackageName()));
                int randompic4 = (rastgele.nextInt(4) + 1);
                String path4 = "resim" + String.valueOf(randompic4);
                Pic4.setImageResource(getResources().getIdentifier(path4, "drawable", getPackageName()));

                if (randompic1 == randompic2 && randompic3 == randompic4) {
                    Result.setText("Win");
                } else {
                    Result.setText("Lose");
                }
            }
        });
    }
}









