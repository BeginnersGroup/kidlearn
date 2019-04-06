package com.example.lenovo_25.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.lenovo_25.myapplication.adapters.ItemListAdapter;

import java.util.ArrayList;

public class ProfessionsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> arrayList;
    ItemListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SecondActivity.menuNo=12;
        recyclerView=findViewById(R.id.rv_professions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String items[] = {"artist","astronaut","baker","captain","carpenter","chef","deliveryboy",
                "doctor","driver","fireman","fisherman","joker","magician","mason","mechanic","nurse",
                "painter","pilot","postman","potter","scientist","sculptor","soldier","teacher","veterinarydoctor"};
        arrayList=new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
            arrayList.add(items[i]);
        }

        listAdapter=new ItemListAdapter(getApplicationContext(),arrayList);
        recyclerView.setAdapter(listAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
