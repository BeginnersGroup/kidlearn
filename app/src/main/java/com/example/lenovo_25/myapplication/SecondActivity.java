package com.example.lenovo_25.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public void CAPSATOZ(View view){

        Intent var=new Intent(SecondActivity.this , CapitalAlphabetActivity.class);
        startActivity(var);
    }

    public void SMALLaTOz(View view){

        Intent var=new Intent(SecondActivity.this , SmallAlphabetActivity.class);
        startActivity(var);
    }

    public void ANIMALS(View view){

        Intent var=new Intent(SecondActivity.this , AnimalsActivity.class);
        startActivity(var);
    }

    public void BIRDS(View view){

        Intent var=new Intent(SecondActivity.this , BirdsActivity.class);
        startActivity(var);
    }

    public void BODYPARTS(View view){

        Intent var=new Intent(SecondActivity.this , BodyPartsActivity.class);
        startActivity(var);
    }

    public void COLORS(View view){

        Intent var=new Intent(SecondActivity.this , ColorsActivity.class);
        startActivity(var);
    }

    public void DAYS(View view){

        Intent var=new Intent(SecondActivity.this , DaysActivity.class);
        startActivity(var);
    }

    public void FRUITS(View view){

        Intent var=new Intent(SecondActivity.this , FruitsActivity.class);
        startActivity(var);
    }

    public void MONTHS(View view){

        Intent var=new Intent(SecondActivity.this , MonthsActivity.class);
        startActivity(var);
    }

    public void NUMBERS(View view){

        Intent var=new Intent(SecondActivity.this , NumbersActivity.class);
        startActivity(var);
    }

    public void PLACES(View view){

        Intent var=new Intent(SecondActivity.this , PlacesActivity.class);
        startActivity(var);
    }

    public void PROFESSIONS(View view){

        Intent var=new Intent(SecondActivity.this , ProfessionsActivity.class);
        startActivity(var);
    }

    public void SHAPES(View view){

        Intent var=new Intent(SecondActivity.this , ShapesActivity.class);
        startActivity(var);
    }

    public void SOLORSYSTEM(View view){

        Intent var=new Intent(SecondActivity.this , SolorSystemActivity.class);
        startActivity(var);
    }

    public void VEGETABLES(View view){

        Intent var=new Intent(SecondActivity.this , VegetablesActivity.class);
        startActivity(var);
    }

    public void VEHICLES(View view){

        Intent var=new Intent(SecondActivity.this , VehiclesActivity.class);
        startActivity(var);
    }

    public void VIDEOS(View view){

        Intent var=new Intent(SecondActivity.this , VideosActivity.class);
        startActivity(var);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
