package com.example.testgitnine;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoviesActivity extends AppCompatActivity {

    RecyclerView list;
    Anime animeList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        list = findViewById(R.id.list_movies);
        getAnimes();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.exit(0);

    }

    private void getAnimes() {
//        Call<List<Anime>> call = RetrofitClient.getInstance().getMyApi().getsuperHeroes("time",5, 25);
        Call<Anime> call = RetrofitClient.getInstance().getMyApi().getDataFromNet();
        Log.e("check code"," 5 - DONE");
        call.enqueue(new Callback<Anime>() {
            @Override
            public void onResponse(Call<Anime> call, Response<Anime> response) {
                animeList = response.body();
                List<Anime.Datum> listData = response.body().data;

                list.setLayoutManager(new LinearLayoutManager(MoviesActivity.this));
                list.setAdapter(new AnimeAdapter(MoviesActivity.this,listData));
                Log.e("check code","onResponse - DONE");
                Log.e("check code","animeList - " + response.body().data.size());
            }

            @Override
            public void onFailure(Call<Anime> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
                Log.e("check code"," 6 - DONE - " + call.toString());
            }
        });
    }
}
