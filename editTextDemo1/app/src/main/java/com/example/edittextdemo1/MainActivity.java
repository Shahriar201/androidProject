package com.example.edittextdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<subButton, addButton> extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1, editText2;
    private Button addButton, subButton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1Id);
        editText2 = findViewById(R.id.editText2Id);
        
        addButton = findViewById(R.id.addButtonId);
        subButton = findViewById(R.id.subButtonId);

        result = findViewById(R.id.resultId );

        //add Lister for add and sub
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        
        try {
            //get EditText1 & EditText2 input
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            //string convert to double
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (v.getId() == R.id.addButtonId) {

                double sum = num1 + num2;
                result.setText("Add Result : "  +sum);

            }
            if (v.getId() == R.id.subButtonId) {

                double sub = num1 - num2;
                result.setText("Sub Result : " +sub);

            }

            }catch (Exception e){

            Toast.makeText(MainActivity.this, "Please Enter numbers", Toast.LENGTH_LONG).show();

        }

    }
}