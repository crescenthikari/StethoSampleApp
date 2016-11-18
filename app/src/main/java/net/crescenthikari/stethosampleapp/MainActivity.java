package net.crescenthikari.stethosampleapp;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import net.crescenthikari.stethosampleapp.db.ExampleDatabase;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExampleDatabase dbHelper = new ExampleDatabase(MainActivity.this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Log.d(TAG, "onCreate: test");
        db.close();
    }
}
