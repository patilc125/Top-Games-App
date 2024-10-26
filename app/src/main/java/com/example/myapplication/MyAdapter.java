package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    ArrayList<GameModul> arrayList;

    public MyAdapter(Context context, ArrayList<GameModul> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView gamimage;
        private TextView gamtitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gamimage=itemView.findViewById(R.id.gi);
            gamtitle=itemView.findViewById(R.id.gn);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     GameModul modul=arrayList.get(position);
     holder.gamtitle.setText(modul.getGamename());
     holder.gamimage.setImageResource(modul.getGp());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
