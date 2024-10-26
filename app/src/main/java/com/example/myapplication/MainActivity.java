package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Data
    ArrayList<GameModul> gamesList;

    //Apdateview
   RecyclerView recyclerView;


    //Apdater
   MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.RV);
        gamesList= new ArrayList<>();
        gamesList.add(new GameModul("a",R.drawable.a));
        gamesList.add(new GameModul("b",R.drawable.b));
        gamesList.add(new GameModul("c",R.drawable.e));
        gamesList.add(new GameModul("d",R.drawable.b));
        adapter=new MyAdapter(this,gamesList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}