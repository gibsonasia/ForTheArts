package com.studios.truhbel.forthearts.Artist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.studios.truhbel.forthearts.R;

/**
 * Created by Asia on 2/2/2018.
 */

public class CreateArtistAccActivity extends AppCompatActivity{

    Spinner spinner;
    EditText name, studioNsme, city, state;
    Button confirmAccount;
    TextView label;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_artist_acc);

        spinner = findViewById(R.id.subject_spinner);
        name = findViewById(R.id.et_name);
        studioNsme = findViewById(R.id.et_studio_name);
        city = findViewById(R.id.et_city);
        confirmAccount = findViewById(R.id.confirm_btn);
        label = findViewById(R.id.spinner_tv);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.subject_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }
}
