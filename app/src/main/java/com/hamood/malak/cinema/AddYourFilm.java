package com.hamood.malak.cinema;

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
        Button btnSave = (Button) findViewById(R.id.button2);
        editText1=(EditText)findViewById((R.id.editText1));
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById((R.id.editText4));
    }
    public void onClick(View v)
    {
        if (v==btnSave)
        {
            Intent intent = new Intent(getBaseContext(), AddYourFilm.class);
            startActivity(intent);
            finish();
        }

    }



}
