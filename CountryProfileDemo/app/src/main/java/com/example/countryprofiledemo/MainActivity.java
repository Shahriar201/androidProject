package com.example.countryprofiledemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity<intent> extends AppCompatActivity implements View.OnClickListener{

    private Button bangladeshButton, indiaButton, pakistanButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton = findViewById(R.id.bangladeshButtonId);
        indiaButton = findViewById(R.id.indiaButtonId);
        pakistanButton = findViewById(R.id.pakistanButtonId);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.bangladeshButtonId)
        {
            intent = new Intent(MainActivity.this, CountryProfileActivity.class);

            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }

        if(v.getId() == R.id.indiaButtonId)
        {
            intent = new Intent(MainActivity.this, CountryProfileActivity.class);

            intent.putExtra("name", "india");
            startActivity(intent);
        }

        if(v.getId() == R.id.pakistanButtonId)
        {
            intent = new Intent(MainActivity.this, CountryProfileActivity.class);

            intent.putExtra("name", "pakistan");
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.alert);
        alertDialogBuilder.setTitle(R.string.alert_title);
        alertDialogBuilder.setTitle(R.string.alert_desc);
        alertDialogBuilder.setCancelable(false);


        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}