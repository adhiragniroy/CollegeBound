package com.example.adhiragniroy.try2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        Button b1 = (Button) findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(Main10Activity.this, Main8Activity.class);
                startActivity(a);
            }
        });

        Button b2 = (Button) findViewById(R.id.button5);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent (Main10Activity.this, Main8Activity.class);
                startActivity(b);
            }
        });

        Button b3 = (Button) findViewById(R.id.button6);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent (Main10Activity.this, Main8Activity.class);
                startActivity(c);
            }
        });

        Button b4 = (Button) findViewById(R.id.button7);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent (Main10Activity.this, Main8Activity.class);
                startActivity(d);
            }
        });

        Button b5 = (Button) findViewById(R.id.button8);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent (Main10Activity.this, Main8Activity.class);
                startActivity(e);
            }
        });

        Button b6 = (Button) findViewById(R.id.button9);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent (Main10Activity.this, Main8Activity.class);
                startActivity(f);
            }
        });

    }
}
