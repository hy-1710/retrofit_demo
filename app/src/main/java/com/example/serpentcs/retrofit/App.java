package com.example.serpentcs.retrofit;

import android.app.Application;

import com.example.serpentcs.retrofit.utils.RetroFitHelper;

/**
 * Created by serpentcs on 19/1/17.
 */

public class App extends Application {

    public static final String TAG;

    static {
        TAG = App.class.getSimpleName();

    }

    RetroFitHelper retroFitHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        retroFitHelper = new RetroFitHelper();
    }

    public RetroFitHelper getRetroFitHelper() {
        return retroFitHelper;
    }

}
