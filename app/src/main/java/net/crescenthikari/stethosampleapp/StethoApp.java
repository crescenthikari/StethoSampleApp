package net.crescenthikari.stethosampleapp;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by Muhammad Fiqri Muthohar on 11/4/16.
 */

public class StethoApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
