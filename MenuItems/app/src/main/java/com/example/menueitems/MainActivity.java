package com.example.menueitems;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
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

        if(item.getItemId() == R.id.settingId){

            Toast.makeText(MainActivity.this, "Setting is selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (item.getItemId() == R.id.shareId){

            Toast.makeText(MainActivity.this, "Share is selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (item.getItemId() == R.id.feedbackId){

            Toast.makeText(MainActivity.this, "Feedback is selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        if(item.getItemId() == R.id.aboutUsId){

            Toast.makeText(MainActivity.this, "About Us is selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}