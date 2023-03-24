package com.example.testgitnine;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.Holder> {

    Context context;
    List<Anime.Datum> list;

    public AnimeAdapter(Context context, List<Anime.Datum> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_view_movi,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Anime.Datum data = list.get(position);
        holder.txt.setText(data.firstName);
//        Uri url = Uri.parse(singleAnime.getProperties().getUrl());
//        holder.txt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_VIEW,url);
//                context.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
//        Log.e("check code","getItemCount - " + list.size());
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView txt;
        public Holder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.single_text);
        }
    }

}
