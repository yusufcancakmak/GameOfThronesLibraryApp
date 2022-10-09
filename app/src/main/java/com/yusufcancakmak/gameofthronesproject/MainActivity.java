package com.yusufcancakmak.gameofthronesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button buttonkrallık;
private Button buttonkarakter;
private Button buttonquiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonkarakter=findViewById(R.id.buttonkarakter);
        buttonkrallık=findViewById(R.id.buttonkrallık);
        buttonquiz=findViewById(R.id.buttonquiz);

        buttonkarakter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,KarakterActivity.class);
                startActivity(intent);
            }
        });
        buttonkrallık.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,KingdomActivity.class);
                startActivity(intent);
            }
        });
        buttonquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}