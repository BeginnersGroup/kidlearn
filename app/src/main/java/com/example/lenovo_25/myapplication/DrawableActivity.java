package com.example.lenovo_25.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;

import java.util.ArrayList;

import static com.example.lenovo_25.myapplication.customSwipeAdapter.mp;
import static com.example.lenovo_25.myapplication.customSwipeAdapter.pos;

public class DrawableActivity extends Activity {

    ViewPager viewPager;
    customSwipeAdapter adapter;
    ImageResource imageResource;
    ArrayList<ImageResource> resources;

    int[] image_resource;
    int[] mp_resource;
    int tag;
    public static Context ctxMain;
    int noOfViewPage;
    String caseAlpha;
    private String[] img_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawable_activity);

        ctxMain=getApplicationContext();
        getIntentData();
        setResourceVariables();
        setImageResource();
        setAdapter();

//        imageResource=new ImageResource(image_resource,img_name);


    }

    private void setImageResource() {
        resources=new ArrayList<>();
        for (int i=0;i<image_resource.length;i++) {
            imageResource = new ImageResource(image_resource[i],img_name[i],mp_resource[i]);
//        resources=new ArrayList<>();
            resources.add(imageResource);
        }
    }

    private void setAdapter() {
        viewPager= (ViewPager) findViewById(R.id.view_pager);
        adapter=new customSwipeAdapter(this,resources);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(tag-1);
        Log.d("setadapterlog",resources.get(tag-1).getImageName()+"");
        customSwipeAdapter.mp=MediaPlayer.create(ctxMain, resources.get(tag-1).getMpName());
        mp.start();
        pos=tag-1;
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                Log.d("Mainpage","i="+i+" v="+v+" il="+i1);
            }

            @Override
            public void onPageSelected(int i) {
Log.d("mainpagesel","selected i="+i);
                pos=i;
                mp=MediaPlayer.create(ctxMain, resources.get(pos).getMpName());
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp1) {
                        mp.prepareAsync();
                        mp1.start();
                    }
                });


            }

            @Override
            public void onPageScrollStateChanged(int i) {
                Log.d("mainpagestate","statechanged i="+i);

            }
        });
//        viewPager.setCurrentItem();
    }

    private void setResourceVariables() {
//        image_resource={R.drawable.a,R.drawable.aa,R.drawable.b};
        // set image names for resource
        noOfViewPage=26;
        //array for image name and media player both
        String tempArrayImgMp[]={"a","b","c","d","e","f","g","h","i","j","k","l","m"
                ,"n","o","p","q","r","s","t","u","v","w","x","y","z"};

        img_name=new String[26];
        if (caseAlpha.equals("upper")) {

            for (int i=0; i<noOfViewPage; i++)
                img_name[i]=tempArrayImgMp[i];


        } else {
           String tempArray[]={"aa","bb","cc","dd","ee","ff","gg","hh","ii","jj",
                    "kk","ll","mm","nn","oo","pp","qq","rr","ss","tt","uu","vv","ww","xx","yy","zz"};
            for (int i=0;i<26;i++)
                img_name[i]=tempArray[i];
        }

        //set image resources by image name
        image_resource=new int[26];
        for (int i=0; i<image_resource.length; i++) {
            image_resource[i]=this.getResources().getIdentifier(img_name[i], "drawable", this.getPackageName());
        }

        //set sound for alphabets
        mp_resource=new int[26];
        for (int i=0; i<noOfViewPage; i++) {
            mp_resource[i]=this.getResources().getIdentifier(tempArrayImgMp[i],"raw", this.getPackageName());
        }
    }

    private void getIntentData() {
        Intent intent=getIntent();

         tag=intent.getIntExtra("imagetag",0);
         caseAlpha=intent.getStringExtra("case");
    }


}
