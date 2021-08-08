package com.example.cseatgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import static android.content.ContentValues.TAG;

public class SpellingCorrect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove actionbar and titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_spelling_correct);

        setContentView(R.layout.activity_math_answer_correct);
        Log.d(TAG,"On Create: started");
        //tick image
        ImageView tickImg = findViewById(R.id.imageViewTick);
        tickImg.setImageResource(getResources().getIdentifier("@drawable/tick",null,this.getPackageName()));

        //star image
        ImageView starImg = findViewById(R.id.imageViewStar);
        starImg.setImageResource(getResources().getIdentifier("@android:drawable/star_big_on",null,this.getPackageName()));



        Button btnBack = findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAllLevelActivity();
            }
        });

        Button btnNext = findViewById(R.id.buttonNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });


    }
    private void openMainActivity(){
        Intent main = new Intent(this,MainActivity.class);
        startActivity(main);
    }

    private void openAllLevelActivity(){
        Intent main = new Intent(this,SpellingAllLevels.class);
        startActivity(main);
    }
}