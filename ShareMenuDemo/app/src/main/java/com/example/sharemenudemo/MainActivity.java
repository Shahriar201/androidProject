package com.example.sharemenudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.shareId);
        //Toast.makeText(getApplicationContext(), "share is clicked", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        String subject = "C programming app";
        String body = "This is very useful to learn C programming.\n com.example.sharemenudemo";

        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, body);

        startActivity(Intent.createChooser(intent, "share it"));


        return super.onOptionsItemSelected(item);
    }
}