package com.studios.truhbel.forthearts.Artist;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;

import com.studios.truhbel.forthearts.R;

/**
 * Created by Asia on 2/2/2018.
 */

public class ArtistLandingPageActivity extends AppCompatActivity {

    ImageView profileImg;
    TextView studioName,cityState, currentTV,recentTv;
    CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_page);

        profileImg = findViewById(R.id.artist_iv);
        studioName = findViewById(R.id.studio_tv);
        cityState = findViewById(R.id.city_state_tv);
        currentTV = findViewById(R.id.current_tv);
        recentTv = findViewById(R.id.recent_tv);

    }
}
