package com.example.mediaplayerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton playButton, pauseButton;
    private ImageView imageView;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButtonId);
        pauseButton = findViewById(R.id.pauseButtonId);

        //create media player
        mediaPlayer = MediaPlayer.create(this, R.raw.video);

        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.playButtonId){

            if (mediaPlayer!= null){
                mediaPlayer.start();
                int duration = mediaPlayer.getDuration()/1000;
                Toast.makeText(MainActivity.this, "song played", Toast.LENGTH_SHORT).show();

            }
        }

        if (v.getId() == R.id.pauseButtonId){

            if (mediaPlayer!=null){
                mediaPlayer.pause();
                Toast.makeText(MainActivity.this, "song paused", Toast.LENGTH_SHORT).show();
            }
        }


    }

    @Override
    protected void onDestroy() {

        if (mediaPlayer!=null && mediaPlayer.isPlaying()){

            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();
    }
}