package com.example.lenovo_25.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class CapitalAlphabetActivity extends AppCompatActivity {

    public void A(View view){

        Intent var=new Intent(CapitalAlphabetActivity.this , DrawableActivity.class);
        int tag=Integer.parseInt(view.getTag().toString());
        var.putExtra("imagetag",tag);
        var.putExtra("menuname",1);
        startActivity(var);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_alphabet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
