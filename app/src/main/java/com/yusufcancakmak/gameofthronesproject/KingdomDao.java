package com.yusufcancakmak.gameofthronesproject;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class KingdomDao {
    @SuppressLint("Range")
    public ArrayList<Kingdom> allKingdom(Veritabani vt){
        ArrayList<Kingdom> kingdomArrayList = new ArrayList<>();
        SQLiteDatabase db =vt.getWritableDatabase();
        Cursor c = db.rawQuery("SELECT*FROM kingdoms",null);
        while (c.moveToNext()){
            Kingdom k;
            k = new Kingdom(c.getInt(c.getColumnIndex("kingdom_id")),
                    c.getString(c.getColumnIndex("kingdomAd")),
                    c.getString(c.getColumnIndex("kingdomAcıklama")),
                    c.getString(c.getColumnIndex("kingdomResim")));
            kingdomArrayList.add(k);
        }
        return kingdomArrayList;
    }
}
