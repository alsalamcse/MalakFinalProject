package com.hamood.malak.cinema;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddYourFilm extends AppCompatActivity {
    private Button btnSave;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_your_film);
         btnSave = (Button) findViewById(R.id.btnSave);
        editText1=(EditText)findViewById((R.id.editText1));
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById((R.id.editText4));
    }
    public void onClick(View v)
    {
        if (v==btnSave)
        {

            String n = editText1.getText().toString();
            String k = editText2.getText().toString();
            String d= editText3.getText().toString();
            String r= editText4.getText().toString();

            Films1 films1= new Films1();



            films1.setName(n);
            films1.setRate(r);
            films1.setKind(k);
            films1.setDate(d);
            MyFilmsTable myFilmsTable= new MyFilmsTable(this);
            myFilmsTable.addFilm(films1);
            //Intent intent = new Intent(getBaseContext(), AddYourFilm.class);
            //startActivity(intent);
            finish();


        }

    }



}
