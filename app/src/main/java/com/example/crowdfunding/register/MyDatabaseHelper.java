package com.example.crowdfunding.register;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=2;
    private static final String DATABASE_NAME="registerFarmer.db";
    public static final String TABLE_NAME="register";
    public static final String COLUMN_ID ="_id";
    public static final String COLUMN1_NAME="name";
    public static final String COLUMN2_NAME="mail";
    public static final String COLUMN3_NAME="address";
    public static final String COLUMN4_NAME="password";

    public MyDatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context,DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query= " CREATE TABLE " + TABLE_NAME + " ( " + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN1_NAME + " TEXT," + COLUMN2_NAME + " TEXT ," +COLUMN3_NAME + " TEXT ," + COLUMN3_NAME + " TEXT ," + COLUMN4_NAME + " TEXT " +");";
        db.execSQL(query);
    }
    public void addFarmer(FarmerRegister farmer){

        ContentValues values = new ContentValues();
        values.put(COLUMN1_NAME,farmer.get_name());
        values.put(COLUMN2_NAME,farmer.get_mail());
        values.put(COLUMN3_NAME,farmer.get_address());
        values.put(COLUMN4_NAME,farmer.get_password());
        SQLiteDatabase db= getWritableDatabase();
        db.insert(TABLE_NAME,null,values);
        db.close();
    }
    public String databaseToString(){
        StringBuilder dbString= new StringBuilder();
        SQLiteDatabase db = getWritableDatabase();
        //String query = "SELECT * FROM" + TABLE_TASKS +"WHERE 1";
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE 1";
        @SuppressLint("Recycle") Cursor c = db.rawQuery(query,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("name"))!=null){
                dbString.append("Name:").append(c.getString(c.getColumnIndex("name"))).append("\n").append("Mail:").append(c.getString(c.getColumnIndex("mail"))).append("\n").append("Address:").append(c.getString(c.getColumnIndex("address"))).append("\n").append("Password:").append(c.getString(c.getColumnIndex("password")));
                dbString.append("\n");
            }
            c.moveToNext();
        }
        db.close();
        return dbString.toString();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
