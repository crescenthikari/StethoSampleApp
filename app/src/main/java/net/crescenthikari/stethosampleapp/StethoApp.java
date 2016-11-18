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
        if (BuildConfig.DEBUG) {
            // Initialize Stetho ony in debug build
            Stetho.initializeWithDefaults(this);
        }
    }
}
