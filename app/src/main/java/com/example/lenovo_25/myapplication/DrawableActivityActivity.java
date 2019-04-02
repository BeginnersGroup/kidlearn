package com.example.lenovo_25.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DrawableActivityActivity extends AppCompatActivity {

    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i=getIntent();

        int tag=i.getIntExtra("imagetag",0);
        ImageView A = (ImageView) findViewById(R.id.a);
        if (i.getStringExtra("case").equals("upper")) {
            switch (tag) {
                case 1:

                    A.setImageResource(R.drawable.a);
                    mp= MediaPlayer.create(DrawableActivityActivity.this , R.raw.a);
                    mp.start();
                    break;

                case 2:
                    A.setImageResource(R.drawable.b);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.b);
                    mp.start();
                    break;

                case 3:
                    A.setImageResource(R.drawable.c);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.c);
                    mp.start();
                    break;

                case 4:
                    A.setImageResource(R.drawable.d);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.d);
                    mp.start();
                    break;

                case 5:
                    A.setImageResource(R.drawable.e);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.e);
                    mp.start();
                    break;

                case 6:
                    A.setImageResource(R.drawable.f);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.f);
                    mp.start();
                    break;

                case 7:
                    A.setImageResource(R.drawable.g);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.g);
                    mp.start();
                    break;

                case 8:
                    A.setImageResource(R.drawable.h);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.h);
                    mp.start();
                    break;

                case 9:
                    A.setImageResource(R.drawable.i);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.i);
                    mp.start();
                    break;

                case 10:
                    A.setImageResource(R.drawable.j);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.j);
                    mp.start();
                    break;

                case 11:
                    A.setImageResource(R.drawable.k);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.k);
                    mp.start();
                    break;

                case 12:
                    A.setImageResource(R.drawable.l);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.l);
                    mp.start();
                    break;

                case 13:
                    A.setImageResource(R.drawable.m);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.m);
                    mp.start();
                    break;

                case 14:
                    A.setImageResource(R.drawable.n);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.n);
                    mp.start();
                    break;

                case 15:
                    A.setImageResource(R.drawable.o);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.o);
                    mp.start();
                    break;

                case 16:
                    A.setImageResource(R.drawable.p);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.p);
                    mp.start();
                    break;

                case 17:
                    A.setImageResource(R.drawable.q);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.q);
                    mp.start();
                    break;

                case 18:
                    A.setImageResource(R.drawable.r);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.r);
                    mp.start();
                    break;

                case 19:
                    A.setImageResource(R.drawable.s);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.s);
                    mp.start();
                    break;

                case 20:
                    A.setImageResource(R.drawable.t);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.t);
                    mp.start();
                    break;

                case 21:
                    A.setImageResource(R.drawable.u);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.u);
                    mp.start();
                    break;

                case 22:
                    A.setImageResource(R.drawable.v);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.v);
                    mp.start();
                    break;

                case 23:
                    A.setImageResource(R.drawable.w);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.w);
                    mp.start();
                    break;

                case 24:
                    A.setImageResource(R.drawable.x);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.x);
                    mp.start();
                    break;

                case 25:
                    A.setImageResource(R.drawable.y);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.y);
                    mp.start();
                    break;

                case 26:
                    A.setImageResource(R.drawable.z);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.z);
                    mp.start();
                    break;

                default:
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            }
        } else {
            switch (tag) {
                case 1:

                    A.setImageResource(R.drawable.aa);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.a);
                    mp.start();
                    break;

                case 2:
                    A.setImageResource(R.drawable.bb);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.b);
                    mp.start();
                    break;

                case 3:
                    A.setImageResource(R.drawable.cc);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.c);
                    mp.start();
                    break;

                case 4:
                    A.setImageResource(R.drawable.dd);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.d);
                    mp.start();
                    break;

                case 5:
                    A.setImageResource(R.drawable.ee);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.e);
                    mp.start();
                    break;

                case 6:
                    A.setImageResource(R.drawable.ff);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.f);
                    mp.start();
                    break;

                case 7:
                    A.setImageResource(R.drawable.gg);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.g);
                    mp.start();
                    break;

                case 8:
                    A.setImageResource(R.drawable.hh);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.h);
                    mp.start();
                    break;

                case 9:
                    A.setImageResource(R.drawable.ii);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.i);
                    mp.start();
                    break;

                case 10:
                    A.setImageResource(R.drawable.jj);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.j);
                    mp.start();
                    break;

                case 11:
                    A.setImageResource(R.drawable.kk);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.k);
                    mp.start();
                    break;

                case 12:
                    A.setImageResource(R.drawable.ll);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.l);
                    mp.start();
                    break;

                case 13:
                    A.setImageResource(R.drawable.mm);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.m);
                    mp.start();
                    break;

                case 14:
                    A.setImageResource(R.drawable.nn);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.n);
                    mp.start();
                    break;

                case 15:
                    A.setImageResource(R.drawable.oo);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.o);
                    mp.start();
                    break;

                case 16:
                    A.setImageResource(R.drawable.pp);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.p);
                    mp.start();
                    break;

                case 17:
                    A.setImageResource(R.drawable.qq);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.q);
                    mp.start();
                    break;

                case 18:
                    A.setImageResource(R.drawable.rr);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.r);
                    mp.start();
                    break;

                case 19:
                    A.setImageResource(R.drawable.ss);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.s);
                    mp.start();
                    break;

                case 20:
                    A.setImageResource(R.drawable.tt);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.t);
                    mp.start();
                    break;

                case 21:
                    A.setImageResource(R.drawable.uu);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.u);
                    mp.start();
                    break;

                case 22:
                    A.setImageResource(R.drawable.vv);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.v);
                    mp.start();
                    break;

                case 23:
                    A.setImageResource(R.drawable.ww);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.w);
                    mp.start();
                    break;

                case 24:
                    A.setImageResource(R.drawable.xx);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.x);
                    mp.start();
                    break;

                case 25:
                    A.setImageResource(R.drawable.yy);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.y);
                    mp.start();
                    break;

                case 26:
                    A.setImageResource(R.drawable.zz);
                    mp = MediaPlayer.create(DrawableActivityActivity.this , R.raw.z);
                    mp.start();
                    break;

                default:
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
