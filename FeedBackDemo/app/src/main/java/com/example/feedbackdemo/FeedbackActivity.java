package com.example.feedbackdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {

    private Button sendButton, cancleButton;
    private EditText nameEditText, feedbackEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        nameEditText = findViewById(R.id.nameEditTextId);
        feedbackEditText = findViewById(R.id.feedbackEditTextId);
        sendButton = findViewById(R.id.sendButtonId);
        cancleButton = findViewById(R.id.clearButtonId);

        sendButton.setOnClickListener(this);
        cancleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String name = nameEditText.getText().toString();
        String feedback = feedbackEditText.getText().toString();


        try {

            if (v.getId() == R.id.sendButtonId) {

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"shahriarbrine201@gmail.com"});

                intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");
                intent.putExtra(Intent.EXTRA_TEXT, "Name: " + name + "\n Message: " + feedback);

                startActivity(Intent.createChooser(intent, "Feedback with"));


            } else if (v.getId() == R.id.clearButtonId) {

                nameEditText.setText("");
                feedbackEditText.setText("");
            }

        } catch (Exception e) {

            Toast.makeText(getApplicationContext(), "Exception: "+e, Toast.LENGTH_SHORT).show();

        }

    }
}