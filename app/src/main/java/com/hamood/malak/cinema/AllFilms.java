package com.hamood.malak.cinema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AllFilms extends AppCompatActivity {
    private TextView textView;
    private TextView cinema;
    private  Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_films);
        textView=(TextView)findViewById(R.id.textView);
        cinema=(TextView)findViewById(R.id.textView);
        btnClick=(Button)findViewById(R.id.btnClick);

    }

    public void onClick(View v)
    {

        if (v==btnClick)
        {
            Intent intent = new Intent(getBaseContext(), FilmsList.class);
            startActivity(intent);
            finish();

        }



    }
}