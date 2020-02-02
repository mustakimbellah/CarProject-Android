package com.example.kamanashis.biswas.mybuttondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2_login extends AppCompatActivity {

    private Button defaultButton, budgetButton, brandButton, ccButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_login);

        defaultButton =(Button) findViewById(R.id.btn_default);
        budgetButton =(Button) findViewById(R.id.btn_budget);
        brandButton =(Button) findViewById(R.id.btn_brand);
        ccButton =(Button) findViewById(R.id.btn_cc);

        defaultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2_login.this,Activity3_default_way.class);
                startActivity(intent);
            }
        });

        budgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2_login.this,Activity4_budget_way.class);
                startActivity(intent);
            }
        });

        brandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2_login.this,Activity5_brand_way.class);
                startActivity(intent);
            }
        });

        ccButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2_login.this,Activity6_cc_way.class);
                startActivity(intent);
            }
        });

    }
}
