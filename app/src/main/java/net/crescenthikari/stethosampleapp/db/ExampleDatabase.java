package net.crescenthikari.stethosampleapp.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Muhammad Fiqri Muthohar on 11/18/16.
 */

public class ExampleDatabase extends SQLiteOpenHelper {

    private static final String DBNAME = "example.db";
    private static final int DB_VERSION = 1;

    private static final String TABLE_EXAMPLE = "example";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "NAME";

    private static final String CREATE_TABLE_EXAMPLE = "CREATE TABLE \""+ TABLE_EXAMPLE +"\""
            + "(\"" + KEY_ID + "\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL"
            + ",\"" + KEY_NAME +"\" VARCHAR)";

    public ExampleDatabase(Context context) {
        super(context, DBNAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_EXAMPLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
