package com.hamood.malak.cinema;

import android.content.Intent;
import android.media.VolumeProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class FilmsList extends AppCompatActivity {
    private ListView CinemaList;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films_list);
        CinemaList=(ListView)findViewById(R.id.CinemaList);
        button2=(Button)findViewById(R.id.button2);

    }
    public void onClick(View v)
    {
        if (v==button2)
        {
            Intent intent = new Intent(getBaseContext(), AddYourFilm.class);
            startActivity(intent);

        }

    }
}
