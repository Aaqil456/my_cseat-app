package com.example.cseatgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove actionbar and titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);
        Button btnMath = findViewById(R.id.buttonMath);
        Button btnSpell = findViewById(R.id.buttonDict);
        Button btnMemory=findViewById(R.id.buttonMemory);
        Button btnStory=findViewById(R.id.buttonStory);
        //math function
        btnMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMathActivity();
            }
        });

        //dictionary function
        btnSpell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpellActivity();
            }
        });

        //memory function
        btnMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMemoryActivity();
            }
        });

        //story function
        btnStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoryActivity();
            }
        });



    }
    private void openMathActivity(){
        Intent main = new Intent(this,MathAllLevels.class);
        startActivity(main);
    }

    private void openSpellActivity(){
        Intent main = new Intent(this,SpellingAllLevels.class);
        startActivity(main);
    }

    private void openMemoryActivity(){
        Intent main = new Intent(this,Memory.class);
        startActivity(main);
    }

    private void openStoryActivity(){
        Intent main = new Intent(this,SelectStory.class);
        startActivity(main);
    }


}