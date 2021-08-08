package com.example.cseatgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Memory_Play_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove actionbar and titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_memory__play_1);

        Button btnTrue = findViewById(R.id.buttonTrue);
        Button btnFalse=findViewById(R.id.buttonFalse);
        Button btnFalse2=findViewById(R.id.buttonFalse2);

        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrueActivity();
            }
        });

        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFalseActivity();
            }
        });

        btnFalse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFalseActivity();
            }
        });


    }
    public void openTrueActivity() {
        Intent correct_ans = new Intent(this,MemoryAnswerCorrect.class);
        startActivity(correct_ans);
    }

    public void openFalseActivity() {
        Intent false_ans = new Intent(this,MemoryAnswerWrong.class);
        startActivity(false_ans);
    }
}