package com.yusufcancakmak.gameofthronesproject;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class KarakterDao {
    @SuppressLint("Range")
    public ArrayList<Karakter> allKarakter(Veritabani vt){
        ArrayList<Karakter> karakterArrayList = new ArrayList<>();
        SQLiteDatabase db = vt.getWritableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM karakters",null);
        while (c.moveToNext()){
            Karakter k;
            k = new Karakter(c.getInt(c.getColumnIndex("karakterid")),
                    c.getString(c.getColumnIndex("karakterisim")),
                    c.getString(c.getColumnIndex("karakteracıklama")),
                    c.getString(c.getColumnIndex("karakterresim")));
            karakterArrayList.add(k);
        }



    return karakterArrayList;
    }


}
