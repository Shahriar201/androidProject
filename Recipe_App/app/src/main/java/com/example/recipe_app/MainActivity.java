package com.example.recipe_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myRecycleView;;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Bread", "200gm chopped\n"+
                "20gm butter\n" +
                "100gm milk\n" +
                "10gm suger", "Method", "Give some butter, milk, suger and mix those ingredients\n", R.drawable.bread));

        recipes1.add(new Recipes("Bread", "200gm chopped\n"+
                "20gm butter\n" +
                "100gm milk\n" +
                "10gm suger", "Method", "Give some butter, milk, suger and mix those ingredients.\n", R.drawable.chocolate));

        recipes1.add(new Recipes("Bread", "200gm chopped\n"+
                "20gm butter\n" +
                "100gm milk\n" +
                "10gm suger", "Method", "Give some butter, milk, suger and mix those ingredients.\n", R.drawable.fish));

        recipes1.add(new Recipes("Bread", "200gm chopped\n"+
                "20gm butter\n" +
                "100gm milk\n" +
                "10gm suger", "Method", "Give some butter, milk, suger and mix those ingredients.\n", R.drawable.french_fries));

        recipes1.add(new Recipes("Bread", "200gm chopped\n"+
                "20gm butter\n" +
                "100gm milk\n" +
                "10gm suger", "Method", "Give some butter, milk, suger and mix those ingredients.\n", R.drawable.orange));

        recipes1.add(new Recipes("Bread", "200gm chopped\n"+
                "20gm butter\n" +
                "100gm milk\n" +
                "10gm suger", "Method", "Give some butter, milk, suger and mix those ingredients.\n", R.drawable.vegitable));

        myRecycleView = findViewById(R.id.recycleViewId);

        myAdapter = new RecyclerViewAdapter(this, recipes1);

        myRecycleView.setLayoutManager(new GridLayoutManager(this, 1));

        myRecycleView.setAdapter(myAdapter);

    }
}