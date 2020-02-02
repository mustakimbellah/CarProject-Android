package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3_default_way extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6, button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_default_way);

        button1 =(Button) findViewById(R.id.btn_5_15m);
        button2 =(Button) findViewById(R.id.btn_15_25m);
        button3 =(Button) findViewById(R.id.btn_25_35m);
        button4 =(Button) findViewById(R.id.btn_35_50m);
        button5 =(Button) findViewById(R.id.btn_50_80m);
        button6 =(Button) findViewById(R.id.btn_80m_1c);
        button7 =(Button) findViewById(R.id.btn_1c);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3_default_way.this,Activity7_5_15M.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3_default_way.this,Activity8_15_25m.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3_default_way.this,Activity9_25_35m.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3_default_way.this,Activity10_35_50m.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3_default_way.this,Activity11_50_80m.class);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3_default_way.this,Activity12_80m_1c.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3_default_way.this,Activity13_1c.class);
                startActivity(intent);
            }
        });


    }
}

