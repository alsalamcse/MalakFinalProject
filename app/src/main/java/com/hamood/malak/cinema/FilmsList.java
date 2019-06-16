package com.hamood.malak.cinema;

import android.content.Intent;
import android.media.VolumeProvider;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FilmsList extends AppCompatActivity {
    private ListView CinemaList;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films_list);
        CinemaList = (ListView) findViewById(R.id.CinemaList);
        button2 = (Button) findViewById(R.id.button2);
        initLiswtView();

    }
    public void onClick(View v)
    {
        if (v==button2)
        {
            Intent intent = new Intent(getBaseContext(), AddYourFilm.class);
            startActivity(intent);

        }

    }
   // String[] a={"one","two","three"};
   // ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,a);
      //  CinemaList.setAdapter(adapter);

    private void initListViewArraySample()
    {
        CinemaList=(ListView) findViewById(R.id.CinemaList);
        String[] a={"one","two","three"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,a);
        CinemaList.setAdapter((adapter));
    }
    private void initLiswtView()
    {
        CinemaList=(ListView) findViewById(R.id.CinemaList);
        MyFilmsTable m1=new MyFilmsTable(this);
        //String [] a =("one" + "two" +"three"):
        ArrayAdapter<Films1> adapter=new ArrayAdapter<Films1>(this,android.R.layout.simple_expandable_list_item_1,m1.getFilmsList());
        CinemaList.setAdapter(adapter);
        CinemaList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Films1 films1=(Films1) parent.getItemAtPosition(position);

                Toast.makeText(FilmsList.this,"FilmName"+films1.getName(),Toast.LENGTH_SHORT).show();

                Intent i=new
                        Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+films1.getName()));
                startActivity(i);
                finish();
                return true;


            }
        });
    }

}
