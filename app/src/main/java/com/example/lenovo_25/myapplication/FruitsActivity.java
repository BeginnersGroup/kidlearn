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

public class FruitsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> arrayList;
    ItemListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SecondActivity.menuNo=8;
        recyclerView=findViewById(R.id.rv_fruits);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String items[] = {"apple","apricot","avocado","banana","blackberry","blueberries",
                "cherries","coconut","cranberries","cucumber","dates","fig","gojiberries","gooseberries",
                "grapes","jackfruit","kiwi","lemon","lime","lychee","mango","mangoosteen","melon",
                "mulberries","orange","papaya","peach","pear","pineapple","plums","pomegranate","raspberry",
                "strawberries","tomato","watermelon"};
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
