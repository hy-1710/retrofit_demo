package com.example.serpentcs.retrofit.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by serpentcs on 19/1/17.
 */

public class RetroFitHelper {
    public static final String TAG = "RetroFitHelper";
    public static final Retrofit retroFitObj;

    static {
        retroFitObj = new Retrofit.Builder()
                .baseUrl("http://api.androidhive.info/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetroFitObj() {
        return retroFitObj;
    }
}
