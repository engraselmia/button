package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button surafatiha,suraekhlash,surafalaq,surafill,surakafirun,surakawsar,suralahab,suramaown,suransor,suraquarish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surafatiha = findViewById(R.id.surafatihaid);
        suraekhlash = findViewById(R.id.suraekhlashid);
        surafalaq = findViewById(R.id.surafalaqid);
        surafill = findViewById(R.id.surafillid);
        surakafirun = findViewById(R.id.surakafirunid);
        surakawsar = findViewById(R.id.surakawsarid);
        suralahab = findViewById(R.id.suralahabid);
        suramaown = findViewById(R.id.suramaownid);
        suransor = findViewById(R.id.suransorid);
        suraquarish = findViewById(R.id.suraquarishid);

        surafatiha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent surafatihavr = new Intent(MainActivity.this,surafatiha.class);
                startActivity(surafatihavr);
            }

        });
        suraekhlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suraekhlashvr = new Intent(MainActivity.this,suraekhlash.class);
                startActivity(suraekhlashvr);

        }

    });

        surafalaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent surafalaqvr = new Intent(MainActivity.this,suraekhlash.class);
                startActivity(surafalaqvr);
            }
        });

        surafill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent surafillvr = new Intent(MainActivity.this,surafill.class);
                startActivity(surafillvr);
            }
        });
        surakafirun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent surakafirunvr = new Intent(MainActivity.this,surakafirun.class);
                startActivity(surakafirunvr);

            }
        });
        surakawsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent surakawsarvr = new Intent(MainActivity.this,surakawsar.class);
                startActivity(surakawsarvr);
            }
        });
        suralahab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suralahabvr = new Intent(MainActivity.this,suralahab.class);
                startActivity(suralahabvr);
            }
        });

        suramaown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suramaownvr = new Intent(MainActivity.this,suramaown.class);
                startActivity(suramaownvr);
            }
        });
        suransor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suransorvr = new Intent(MainActivity.this,suransor.class);
                startActivity(suransorvr);
            }
        });
        suraquarish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suraquarishvr = new Intent(MainActivity.this,suraquarish.class);
                startActivity(suraquarishvr);
            }
        });
}}