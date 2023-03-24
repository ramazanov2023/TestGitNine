package com.example.testgitnine;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static RetrofitClient instance = null;
//    private Api myApi;
    Retrofit retrofit;

    private RetrofitClient() {
        Log.e("check code"," 1 - DONE");
        retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
//        myApi = retrofit.create(Api.class);
        Log.e("check code"," 2 - DONE");
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        Log.e("check code"," 3 - DONE");
        return instance;
    }

    public Api getMyApi() {
        Log.e("check code"," 4 - DONE");
        return retrofit.create(Api.class);
    }

}
