package com.hamood.malak.cinema;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;

import static com.hamood.malak.cinema.Films1.*;

public class MyFilmsTable extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;// رقم الגרסה
    private static final String DATABASE_NAME = "FILMS_DB";// اسم قاعدة البيانات
    private static final String TABLE_FILMS = "FILMS_TBL";// اسم الجدول
    private static final String KEY_ID = "_id";
    private static final String KEY_NAME = "name";
    private static final String KEY_KIND = "KIND";
    private static final String KEY_DATE = "DATE";
    private static final String KEY_RATE = "RATE";


    public MyFilmsTable(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {// دالة تبني الجدول تعمل فقط مرة واحدة
        String sqlCreate = "CREATE TABLE " + TABLE_FILMS + "(" + KEY_ID + "INTEGER PRIMARY KEY," + KEY_DATE + "TEXT," + KEY_KIND + "TEXT," + KEY_NAME + "TEXT," + KEY_RATE + "TEXT" + ")";//أوامر ب SQLite

        db.execSQL(sqlCreate);//من اجل تشغيل الاوامر بقاعدة البيانات نستعمل هذه الدالة

    }//يتم بناء الجدول


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {//دالة تحدث بالجدول فقط اذا غيرنا شيء بالجدول(زدنا أو نقصنا)

        String sqlDrop = "DROP TABLE IF EXISTS " + TABLE_FILMS;
        db.execSQL(sqlDrop);
        onCreate(db);
    }

    public long addFilm(Films1 film) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, film.getName());
        values.put(KEY_DATE, film.getDate());
        values.put(KEY_KIND, film.getKind());
        values.put(KEY_RATE, film.getRate());
        long row = db.insert(TABLE_FILMS, null, values);
        db.close();
        return row;
    }

    public int updateSong(Films1 film) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, film.getName());
        values.put(KEY_KIND, film.getKind());
        values.put(KEY_DATE, film.getDate());
        values.put(KEY_ID, film.getRate());
        int num = db.update(TABLE_FILMS, values, KEY_ID + "=" + film.get_id(), null);
        db.close();
        return num;
    }

    public int deleteFilmById(Films1 films1) {
        SQLiteDatabase db = this.getWritableDatabase();
        int num = db.delete(TABLE_FILMS, KEY_ID + "=" + films1.get_id(), null);
        db.close();
        return num;
    }

    public ArrayList<Films1> getFilmsList() {
        ArrayList<Films1> allFilms = new ArrayList<>();
        String selectQuery = " SELECT *FROM " + TABLE_FILMS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        boolean flag= cursor.moveToFirst();
        while (flag==true) {
            do {
                Films1 films1 = new Films1();
                films1.set_id((cursor.getLong(0)));//id+
                films1.setDate((cursor.getString(1)));//date
                films1.setKind((cursor.getString(2)));//kind
                films1.setName((cursor.getString(3)));//name
                films1.setRate((cursor.getString(4)));//rate
                allFilms.add(films1);
            }
            while ((cursor.moveToNext()));

        }
        return allFilms;
    }
}
