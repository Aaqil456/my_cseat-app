package com.example.cseatgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class Memory_Memo_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove actionbar and titlebar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_memory__memo_1);

        Button btnBack = findViewById(R.id.buttonBack);
        Button btnNext = findViewById(R.id.buttonNext);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            findMemoryMainActivity();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findMemoryMemo_2Activity();
            }
        });
    }

    private void findMemoryMainActivity(){
        Intent main = new Intent(this,MemoryMain.class);
        startActivity(main);
    }
    private void findMemoryMemo_2Activity(){
        Intent main = new Intent(this,Memory_Memo_2.class);
        startActivity(main);
    }

}