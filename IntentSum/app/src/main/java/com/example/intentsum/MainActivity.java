package com.example.intentsum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String ExtraString = "com.example.intentsum";

    private EditText editText1, editText2;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1Id);
        editText2 = findViewById(R.id.editText2Id);
        addButton = findViewById(R.id.addButtonId);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //convert integer number to string
                int number1 = Integer.parseInt(editText1.getText().toString());
                int number2 = Integer.parseInt(editText2.getText().toString());
                int result = number1 + number2;


                Intent intent =  new Intent(MainActivity.this, MainActivity2.class);

                //send value to the second activity
                intent.putExtra("value", String.valueOf(result));

                startActivity(intent);
            }
        });
    }
}