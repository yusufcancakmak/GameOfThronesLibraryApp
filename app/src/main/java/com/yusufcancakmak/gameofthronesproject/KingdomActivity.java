package com.yusufcancakmak.gameofthronesproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.IOException;
import java.util.ArrayList;

public class KingdomActivity extends AppCompatActivity {
private RecyclerView recyview;
private ArrayList<Kingdom> kingdomArrayList;
private Veritabani vt;
private KingdomAdapte adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kingdom);

        recyview=findViewById(R.id.recyview);
        veritabanikopyala();
        vt=new Veritabani(this);
        recyview.setHasFixedSize(true);
        recyview.setLayoutManager(new LinearLayoutManager(this));

        kingdomArrayList = new KingdomDao().allKingdom(vt);
        adapter= new KingdomAdapte(this,kingdomArrayList);
        recyview.setAdapter(adapter);

    }
    public void veritabanikopyala(){
        DatabaseCopyHelper db = new DatabaseCopyHelper(this);
        try {
            db.createDataBase();
        }catch (IOException e){
            e.printStackTrace();
        }
        db.openDataBase();
    }
}