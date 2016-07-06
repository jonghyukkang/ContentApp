package kang.navigationview;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kangjonghyuk on 2016. 7. 6..
 */
public class ContentDB extends SQLiteOpenHelper {
    static final String DATABASE_NAME = "contentDB.db";
    static final int DATABASE_VERSION = 1;

    public ContentDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql1 = "create table lab1 ("
                + "number text primary key," // 010-5503-3471
                + "name text,"  // 강종혁
                + "email text," // saz300@naver.com
                + "naesun integer," // 511
                + "depart integer"  // 1
                + ");";

        String sql2 = "create table lab2 ("
                + "number text primary key," // 010-5503-3471
                + "name text,"  // 강종혁
                + "email text," // saz300@naver.com
                + "naesun integer," // 511
                + "depart integer"  // 1
                + ");";

        String sql3 = "create table lab3 ("
                + "number text primary key," // 010-5503-3471
                + "name text,"  // 강종혁
                + "email text," // saz300@naver.com
                + "naesun integer," // 511
                + "depart integer"  // 1
                + ");";

        String sql4 = "create table manasign ("
                + "number text primary key," // 010-5503-3471
                + "name text,"  // 강종혁
                + "email text," // saz300@naver.com
                + "naesun integer," // 511
                + "depart text"  // design or manage
                + ");";

        db.execSQL(sql1);
        db.execSQL(sql2);
        db.execSQL(sql3);
        db.execSQL(sql4);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql1 = "DROP TABLE IF EXISTS lab1";
        String sql2 = "DROP TABLE IF EXISTS lab2";
        String sql3 = "DROP TABLE IF EXISTS lab3";
        String sql4 = "DROP TABLE IF EXISTS manasign";

        db.execSQL(sql1);
        db.execSQL(sql2);
        db.execSQL(sql3);
        db.execSQL(sql4);

        onCreate(db);
    }
}
