package com.example.serpentcs.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by serpentcs on 19/1/17.
 */

public interface GitHub {
    @GET("/contacts")
    Call<Contributor> contributors();
}
