package com.example.cseatgame;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MathAllLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove actionbar and titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_math_all_levels);

        Button btnBack = findViewById(R.id.buttonBack);
        Button btnLvl1 = findViewById(R.id.buttonLvl1);
        Button btnLvl2 = findViewById(R.id.buttonlvl2);
        Button btnLvl3 = findViewById(R.id.buttonlvl3);

        //back function
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        //enter lvl 1
        btnLvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLvl1Activity();
            }
        });
    }
    private void openMainActivity() {
        Intent main = new Intent(this,MainActivity.class);
        startActivity(main);
    }

    private void openLvl1Activity() {
        Intent main = new Intent(this,Lvl_1_math.class);
        startActivity(main);
    }
}