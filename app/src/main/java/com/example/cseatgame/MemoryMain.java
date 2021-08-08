package com.example.cseatgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MemoryMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove actionbar and titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_memory_main);

        Button btnBack = findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findMemoryActivity();
            }
        });

        Button btnMemo= findViewById(R.id.buttonMemorize);
        btnMemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findMemoryMemo1Activity();
            }
        });

        Button btnPlay=findViewById(R.id.buttonPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findMemoryPlay_1Activity();
            }
        });

    }

    private void findMemoryActivity(){
        Intent main = new Intent(this,Memory.class);
        startActivity(main);
    }

    private void findMemoryMemo1Activity(){
        Intent main = new Intent(this,Memory_Memo_1.class);
        startActivity(main);
    }
    private void findMemoryPlay_1Activity(){
        Intent main = new Intent(this,Memory_Play_1.class);
        startActivity(main);
    }
}