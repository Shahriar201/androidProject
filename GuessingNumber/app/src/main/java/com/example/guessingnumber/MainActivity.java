package com.example.guessingnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private TextView textView;
    private Button checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextId);
        textView = findViewById(R.id.textViewId);
        checkButton = findViewById(R.id.checkButtonId);

        checkButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String guessString = editText.getText().toString();

        int guess = Integer.parseInt(guessString);

        if(guessString.isEmpty()){
            errorMessage();
        }
        else{

            if (guess > 5){

                errorMessage();
            }

            //Generating random number
            Random random = new Random();
            int randomNumber = random.nextInt(5)+1;

            if (randomNumber == guess){
                textView.setText("Congrats! You have won");
            }

            else{
                textView.setText("Congrats! You have lose. Random number was " +randomNumber);

            }
        }

    }

    void errorMessage(){
        editText.setError("please enter a valid input");
        editText.requestFocus();
        return;
    }
}