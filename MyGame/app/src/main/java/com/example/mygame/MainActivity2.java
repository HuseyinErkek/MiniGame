package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private ImageButton Upbtn,Downbtn;
    private ImageView Wallet;
    private Button Play;
    private TextView tvtviewlabel,NameSname,name,ChangeIt;
    private String GUser;
    int hak;
    Random rastgele = new Random();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Upbtn=findViewById(R.id.upbtn);
        Downbtn=findViewById(R.id.downbtn);
        Play=findViewById(R.id.playbtn);
        tvtviewlabel=findViewById(R.id.txtviewlabel);
        ChangeIt=findViewById(R.id.uselabel1);
        NameSname=findViewById(R.id.nameSurname);
        Wallet= findViewById(R.id.imageView);

        Intent GIntent = getIntent();
        GUser = GIntent.getStringExtra("Entname");
        NameSname.setText("Welcome "+ GUser) ;

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("HAK",hak);
                startActivity(intent);
            }
        });

        Upbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hak = rastgele.nextInt(25);
                ChangeIt.setText("Spin " + hak ); Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("HAK",hak);
                startActivity(intent);
            }
        });
        Downbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int hak = rastgele.nextInt(5);
                ChangeIt.setText("Spin " + hak ); Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("HAK",hak);
                startActivity(intent);
            }
        });
    }
            @Override
            public void onBackPressed() {
                 Intent backIntent = new Intent(MainActivity2.this,MainActivity.class);
                 startActivity(backIntent);
            }
            // Değiştirilcek Alan
            }
