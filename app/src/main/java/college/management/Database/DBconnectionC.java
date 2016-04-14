package college.management.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBconnectionC extends SQLiteOpenHelper {


    public DBconnectionC (Context context) {
        super(context, "MDBA", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql="CREATE TABLE marksC (sub1 NUMBER, sub2 NUMBER, sub3 NUMBER);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    /* ###################### DB Profile 1 ################################### */

    public void insert(Subjects subMarks) {

        ContentValues data= new ContentValues();
        data.put("sub1", subMarks.getSub1());
        data.put("sub2", subMarks.getSub2());
        data.put("sub3", subMarks.getSub3());

        SQLiteDatabase database= getWritableDatabase();
        database.insert("marksC", null, data);
    }

    public String subjectI() {

        String sub1= "";
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT sub1 FROM marksC;", null);

        while (cursor.moveToNext()) {
            String s1= cursor.getString(cursor.getColumnIndex("sub1"));
            sub1 = s1;
        }
        return sub1;
    }


    public String subjectII() {

        String sub2= "";
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT sub2 FROM marksC;", null);

        while (cursor.moveToNext()) {
            String s2= cursor.getString(cursor.getColumnIndex("sub2"));
            sub2 = s2;
        }
        return sub2;
    }

    public String subjectIII() {

        String sub3= "";
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT sub3 FROM marksC;", null);

        while (cursor.moveToNext()) {
            String s3= cursor.getString(cursor.getColumnIndex("sub3"));
            sub3 = s3;
        }
        return sub3;

    }

    public int total() {

        int ttl= 0;
        SQLiteDatabase database= getReadableDatabase();
        Cursor cursor= database.rawQuery("SELECT * FROM marksC;", null);

        while (cursor.moveToNext()) {
            int s1= cursor.getInt(cursor.getColumnIndex("sub1"));
            int s2= cursor.getInt(cursor.getColumnIndex("sub2"));
            int s3= cursor.getInt(cursor.getColumnIndex("sub3"));
            ttl = s1+s2+s3;
        }
        return ttl;

    }


    public float percent() {
        float tot = total();
        float mx = 75f;
        return (tot / mx) * 100;
    }
    /* ###################### DB Profile 1 ENDS ################################### */




}
