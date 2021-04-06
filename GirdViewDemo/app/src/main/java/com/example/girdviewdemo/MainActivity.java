package com.example.girdviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] countryNames;
    private GridView gridView;


    int[] flags = {
            R.drawable.bd_icon, R.drawable.india_icon, R.drawable.pakistan_icon,
            R.drawable.bd_icon, R.drawable.india_icon, R.drawable.pakistan_icon,
            R.drawable.bd_icon, R.drawable.india_icon, R.drawable.pakistan_icon,
            R.drawable.bd_icon, R.drawable.india_icon, R.drawable.pakistan_icon,
            R.drawable.bd_icon, R.drawable.india_icon, R.drawable.pakistan_icon,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridViewId);

        countryNames = getResources().getStringArray(R.array.country_names);

        CustomAdapter adapter = new CustomAdapter(this, countryNames, flags);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //take selected items
                String value = countryNames[position];

                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}