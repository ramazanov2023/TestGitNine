package com.example.testgitnine;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

//    String BASE_URL = "https://shikimori.one/";
//    String BASE_URL = "https://simplifiedcoding.net/demos/";
    String BASE_URL = "https://reqres.in/";
//    @GET("fdsnws/event/1/query?format=geojson")
//    @GET("marvel")
    @GET("api/users?page=2")
//    Call<List<Anime>> getsuperHeroes(@Query("orderby") String orderby, @Query("minmag") int minmag, @Query("limit") int limit);
    Call<Anime> getDataFromNet();

}
