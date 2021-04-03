package com.example.intentsum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.texiViewId);

        //receive first intent value
        Bundle bundle = getIntent().getExtras();

        if (bundle!= null){
            value = bundle.getString("value");
        }


        //another way to get value
        //String value = getIntent().getStringExtra("value");


        textView.setText("Submision is " +value);


    }
}