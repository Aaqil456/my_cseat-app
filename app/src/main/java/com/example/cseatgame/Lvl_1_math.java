package com.example.cseatgame;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Lvl_1_math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_lvl_1_math);
        TextView question= findViewById(R.id.answer_textView);
        Button btnAns1 = findViewById(R.id.ansBtn1);
        Button btnAns2 = findViewById(R.id.ansBtn2);
        Button btnAns3 = findViewById(R.id.ansBtn3);
        Button btnAns4 = findViewById(R.id.ansBtn4);

//button 1
        btnAns1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFalseActivity();

            }
        });


//button2
        btnAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFalseActivity();
            }
        });


//button3
        btnAns3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTrueActivity();
            }
        });


//button4
        btnAns4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFalseActivity();

            }
        });



    }

    public void openTrueActivity() {
        Intent correct_ans = new Intent(this,MathAnswerCorrect.class);
        startActivity(correct_ans);
    }

    public void openFalseActivity() {
        Intent false_ans = new Intent(this,MathAnswerWrong.class);
        startActivity(false_ans);
    }

}

