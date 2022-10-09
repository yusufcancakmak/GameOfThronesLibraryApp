package com.yusufcancakmak.gameofthronesproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.IOException;
import java.util.ArrayList;

public class KarakterActivity extends AppCompatActivity {
private RecyclerView rv;
private Veritabani vt;
private KarakterAdapter adapter;
private ArrayList <Karakter> karakterArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karakter);

        rv=findViewById(R.id.rv);
        veritabanicopy();
        vt =new Veritabani(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));


        karakterArrayList = new KarakterDao().allKarakter(vt);
        adapter=new KarakterAdapter(this,karakterArrayList);
        rv.setAdapter(adapter);

    }

    public void veritabanicopy(){
        DatabaseCopyHelper data = new DatabaseCopyHelper(this);
        try {
            data.createDataBase();
        }catch (IOException e){
            e.printStackTrace();
        }
        data.openDataBase();
    }
}