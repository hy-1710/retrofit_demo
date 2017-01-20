package com.example.serpentcs.retrofit;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.serpentcs.retrofit.databinding.ActivityMainBinding;
import com.example.serpentcs.retrofit.utils.RetroFitHelper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    App app;
    RetroFitHelper retroFitHelper;

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        app = (App) getApplication();
    }


    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        setSupportActionBar(binding.toolbar);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        gitHubTask();
    }

    public void gitHubTask() {
        Retrofit retrofit = app.getRetroFitHelper().getRetroFitObj();
        GitHub gitHub = retrofit.create(GitHub.class);
        Call<Contributor> call = gitHub.contributors();

        call.enqueue(new Callback<Contributor>() {
            @Override
            public void onResponse(Call<Contributor> call, Response<Contributor> response) {
                if (response.isSuccessful()) {
                    Log.e(TAG, "onResponse: response-----" + response.body().getContactsList().get(0).getPhone().toString());
                    Log.e(TAG, "onResponse: " + response.body().toString());
                } else {

                }

            }

            @Override
            public void onFailure(Call<Contributor> call, Throwable t) {

            }
        });


    }
}
