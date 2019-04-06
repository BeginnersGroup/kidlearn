package com.example.lenovo_25.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.Scroller;

import com.example.lenovo_25.myapplication.adapters.customSwipeAdapter;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static com.example.lenovo_25.myapplication.adapters.customSwipeAdapter.mp;
import static com.example.lenovo_25.myapplication.adapters.customSwipeAdapter.pos;

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
    int menu;
    private String[] img_name;
    private String[] mp_name;


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
//                        mp.prepareAsync();
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

//        Field mScroller;
//        mScroller=customSwipeAdapter.class.getDeclaredField()

    }

    private void setResourceVariables() {
//        image_resource={R.drawable.a,R.drawable.aa,R.drawable.b};
        // set image names for resource
        noOfViewPage=26;
        //array for image name and media player both


        switch (menu) {
            case 1 :  // for capital alphabets
                // variable contains image name
                String tempArray1[]={"a","b","c","d","e","f","g","h","i","j","k","l","m"
                        ,"n","o","p","q","r","s","t","u","v","w","x","y","z"};

                // variable contains sound name
                String tempArrayImgMp1[]={"a","b","c","d","e","f","g","h","i","j","k","l","m"
                        ,"n","o","p","q","r","s","t","u","v","w","x","y","z"};


                noOfViewPage=tempArray1.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];

                for (int i=0; i<noOfViewPage; i++) {
                    img_name[i] = tempArray1[i];
                    mp_name[i] = tempArrayImgMp1[i];
                }
                break;
            case 2 :  // for small alphabets
                String tempArray2[]={"aa","bb","cc","dd","ee","ff","gg","hh","ii","jj",
                        "kk","ll","mm","nn","oo","pp","qq","rr","ss","tt","uu","vv","ww","xx","yy","zz"};
                String tempArrayImgMp2[]={"a","b","c","d","e","f","g","h","i","j","k","l","m"
                        ,"n","o","p","q","r","s","t","u","v","w","x","y","z"};

                noOfViewPage=tempArray2.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];

                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray2[i];
                    mp_name[i] = tempArrayImgMp2[i];
                }
                break;
            case 3 :  // for animals
                String tempArray3[]={"alligator","anteater","ape","bear","buffalo","camel","cheetah","chimpanzee","deer",
                "dinosaur","donkey","elephant","elephantseal","fox","giraffe","gorilla","hamster","hippopotamus","horse",
                        "hyena","jackal","jaguar","kangaroo","lion","mangoose","monkey","moose","panther","polarbear",
                        "porcupin","rabbit","raccoon","reindeer","rhinoceros","snake","tiger","ultrasaurus","walrus","yak","zebra"};
                String tempArrayImgMp3[]=tempArray3;

                noOfViewPage=tempArray3.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray3[i];
                    mp_name[i] = tempArrayImgMp3[i];
                }
                break;
            case 4 :  // for birds
                String tempArray4[]= {"crane","crow","cuckoo","duck","eagle","hen","kingfisher","ostrich",
                        "owl","parrot","peacock","pelican","pigeon","redparrot","rooster","seagull",
                        "sparrow","stork","swan","turkey","woodpecker"};
                String tempArrayImgMp4[]=tempArray4;

                noOfViewPage=tempArray4.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray4[i];
                    mp_name[i] = tempArrayImgMp4[i];
                }
                break;
            case 5 :  // for body parts
                String tempArray5[]= {"ankle","arm","bodyparts","cheek","chest","chin","ears","elbow","eyes",
                        "fingers","foot","forehead","head","knee","leg","mouth","neck","nose","stomach",
                        "teeth","thigh","toes","tongue","wrist"};
                String tempArrayImgMp5[]=tempArray5;

                noOfViewPage=tempArray5.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray5[i];
                    mp_name[i] = tempArrayImgMp5[i];
                }
                break;
            case 6 :  // for colors
                String tempArray6[]= {"black","blue","brown","green","grey","orange","pink",
                        "purple","red","violet","white","yellow"};
                String tempArrayImgMp6[]=tempArray6;

                noOfViewPage=tempArray6.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray6[i];
                    mp_name[i] = tempArrayImgMp6[i];
                }
                break;
            case 7 :  // for days
                String tempArray7[]= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
                String tempArrayImgMp7[]=tempArray7;

                noOfViewPage=tempArray7.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray7[i];
                    mp_name[i] = tempArrayImgMp7[i];
                }
                break;
            case 8 :  // for fruits
                String tempArray8[]= {"apple","apricot","avocado","banana","blackberry","blueberries",
                "cherries","coconut","cranberries","cucumber","dates","fig","gojiberries","gooseberries",
                "grapes","jackfruit","kiwi","lemon","lime","lychee","mango","mangoosteen","melon",
                "mulberries","orange2","papaya","peach","pear","pineapple","plums","pomegranate","raspberry",
                "strawberries","tomato","watermelon"};
                String tempArrayImgMp8[]=tempArray8;

                noOfViewPage=tempArray8.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray8[i];
                    mp_name[i] = tempArrayImgMp8[i];
                }
                break;
            case 9 :  // for months
                String tempArray9[]= {"january","february","march","april","may","june","july","august",
                        "september","october","november","december"};
                String tempArrayImgMp9[]=tempArray9;

                noOfViewPage=tempArray9.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray9[i];
                    mp_name[i] = tempArrayImgMp9[i];
                }
                break;
            case 10 :  // for numbers
//                String tempArray10[]= {};
//                String tempArrayImgMp10[]=tempArray10;

//                noOfViewPage=tempArray10.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
//                    img_name[i] = tempArray10[i];
                    img_name[i]=i+"";
                    mp_name[i] = i+"";
                }
                break;
            case 11 :  // for places
                String tempArray11[]= {"airport","aquarium","beach","busstop","church","cinematheater",
                        "firestation","fuelstation","harbour","hospital","house","laboratory","library",
                "mosque","museaum","policestation","postoffice","powerplant","railwaystation","restaurant",
                "school","stadium","temple","themepark","zoo"};
                String tempArrayImgMp11[]=tempArray11;

                noOfViewPage=tempArray11.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray11[i];
                    mp_name[i] = tempArrayImgMp11[i];
                }
                break;
            case 12 :  // for profession
                String tempArray12[]= {"artist","astronaut","baker","captain","carpenter","chef","deliveryboy",
                "doctor","driver","fireman","fisherman","joker","magician","mason","mechanic","nurse",
                "painter","pilot","postman","potter","scientist","sculptor","soldier","teacher","veterinarydoctor"};
                String tempArrayImgMp12[]=tempArray12;

                noOfViewPage=tempArray12.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray12[i];
                    mp_name[i] = tempArrayImgMp12[i];
                }
                break;
            case 13 :  // for shapes
                String tempArray13[]= {"circle","cross","diamond","heart","hexagon","octagon","parallelogram",
                "pentagon","quadrant","rectangle","semicircle","square","star","trapezoid","triangle"};
                String tempArrayImgMp13[]=tempArray13;

                noOfViewPage=tempArray13.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray13[i];
                    mp_name[i] = tempArrayImgMp13[i];
                }
                break;
            case 14 :  // for solar systems
                String tempArray14[]= {"earth","jupiter","mars","mercury","neptune","saturn","uranus","venus"};
                String tempArrayImgMp14[]=tempArray14;

                noOfViewPage=tempArray14.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray14[i];
                    mp_name[i] = tempArrayImgMp14[i];
                }
                break;
        }
       /* if (menu==1) {
            String tempArray[]={"a","b","c","d","e","f","g","h","i","j","k","l","m"
                    ,"n","o","p","q","r","s","t","u","v","w","x","y","z"};
            for (int i=0; i<noOfViewPage; i++)
                img_name[i]=tempArray[i];


        } else {
           String tempArray[]={"aa","bb","cc","dd","ee","ff","gg","hh","ii","jj",
                    "kk","ll","mm","nn","oo","pp","qq","rr","ss","tt","uu","vv","ww","xx","yy","zz"};
            for (int i=0;i<26;i++)
                img_name[i]=tempArray[i];
        }*/

        //set image resources by image name
        image_resource=new int[noOfViewPage];
        for (int i=0; i<noOfViewPage; i++) {
            image_resource[i]=this.getResources().getIdentifier(img_name[i], "drawable", this.getPackageName());
        }

        //set sound for alphabets
//        String tempArrayImgMp[]={"a","b","c","d","e","f","g","h","i","j","k","l","m"
//                ,"n","o","p","q","r","s","t","u","v","w","x","y","z"};
        mp_resource=new int[noOfViewPage];
        for (int i=0; i<noOfViewPage; i++) {
            mp_resource[i]=this.getResources().getIdentifier(mp_name[i],"raw", this.getPackageName());
        }
    }

    private void getIntentData() {
        Intent intent=getIntent();

         tag=intent.getIntExtra("imagetag",0);
         menu=intent.getIntExtra("menuname",0);
    }


}
