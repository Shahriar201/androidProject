package com.example.countryprofiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryProfileActivity extends AppCompatActivity {

    private ImageView profileImage;
    private TextView profileText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile);

        profileImage = findViewById(R.id.imageViewId);
        profileText = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }
    }

    private void showDetails(String countryName) {

        if (countryName.equals("bangladesh"))
        {
            profileImage.setImageResource(R.drawable.bangladesh_cover);
            profileText.setText(R.string.bd_desc);
        }

        if(countryName.equals("india"))
        {
            profileImage.setImageResource(R.drawable.india_cover);
            profileText.setText(R.string.india_desc);
        }

        if(countryName.equals("pakistan"))
        {
            profileImage.setImageResource(R.drawable.pakistan_cover);
            profileText.setText(R.string.paksitan_desc);
        }
    }
}