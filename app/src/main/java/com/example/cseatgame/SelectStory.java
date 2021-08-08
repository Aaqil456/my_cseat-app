package com.example.cseatgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectStory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove actionbar and titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_select_story);
        Button btnBack = findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });




        ImageButton btnImgStore = findViewById(R.id.imageButtonStore);
        btnImgStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoreStory1Activity();
            }
        });
    }

    private void openStoreStory1Activity(){
        Intent main = new Intent(this,StoreShortStory1.class);
        startActivity(main);
    }

    private void openMainActivity(){
        Intent main = new Intent(this,MainActivity.class);
        startActivity(main);
    }
}