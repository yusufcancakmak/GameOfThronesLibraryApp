package com.yusufcancakmak.gameofthronesproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Veritabani extends SQLiteOpenHelper{


    public Veritabani(@Nullable Context context) {
        super(context, "gameofthronesstory.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE IF NOT EXISTS Kingdoms (\n" +
            "\t kingdom_id\tINTEGER,\n" +
            "\t kingdomAd\tTEXT,\n" +
            "\t kingdomAcıklama\tTEXT,\n" +
            "\t kingdomResim\tTEXT,\n" +
            " PRIMARY KEY(kingdom_id)\n" +
            ");");


    db.execSQL("CREATE TABLE IF NOT EXISTS karakters (\n" +
            "\t karakterid\tINTEGER,\n" +
            "\t karakterisim\tTEXT,\n" +
            "\t karakteracıklama\tTEXT,\n" +
            "\t karakterresim\tTEXT,\n" +
            "\tPRIMARY KEY(karakterid)\n" +
            ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    db.execSQL("DROP TABLE IF EXISTS Kingdoms");

    db.execSQL("DROP TABLE IF EXISTS karakters");
    onCreate(db);
    }


}
