package com.example.lenovo_25.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo_25.myapplication.adapters.customSwipeAdapter;
import java.util.ArrayList;

import static com.example.lenovo_25.myapplication.adapters.customSwipeAdapter.mp;
import static com.example.lenovo_25.myapplication.adapters.customSwipeAdapter.pos;

public class DrawableActivity extends Activity {

    ViewPager viewPager;
    customSwipeAdapter adapter;
    ImageResource imageResource;
    ArrayList<ImageResource> resources;

    TextView title_tv;

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
        viewPager= findViewById(R.id.view_pager);
        adapter=new customSwipeAdapter(this,resources);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(tag-1);
        Log.d("setadapterlog",resources.get(tag-1).getImageName()+"");

        mp=MediaPlayer.create(ctxMain, resources.get(tag-1).getMpName());
        pos=tag-1;
        try {
//            mps.get(pos).prepare();
//            mps.get(pos).start();
            mp.start();
        } catch (Exception e) {
            Toast.makeText(this,"error:"+e,Toast.LENGTH_LONG).show();
        }
//        mp.start();

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                Log.d("Mainpage","i="+i+" v="+v+" il="+i1);
            }

            @Override
            public void onPageSelected(int i) {
Log.d("mainpagesel","selected i="+i);
                pos=i;
                try {

//                    mps.get(i).prepare();
//                    mps.get(i).start();
                    mp.release();
                    mp=null;
                    mp = MediaPlayer.create(ctxMain, resources.get(pos).getMpName());
//                    mp.prepare();
                    mp.start();
//                    mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
//                        @Override
//                        public void onPrepared(MediaPlayer mp1) {
////                        mp.prepareAsync();
//                            mp1.start();
//                        }
//                    });
                } catch(Exception e) {
                    Toast.makeText(DrawableActivity.this, "media player error:"+e, Toast.LENGTH_SHORT).show();
                }


            }

            @Override
            public void onPageScrollStateChanged(int i) {
                Log.d("mainpagestate","statechanged i="+i);

            }
        });

    }

    private void setResourceVariables() {
//        image_resource={R.drawable.a,R.drawable.aa,R.drawable.b};
        // set image names for resource
        title_tv=findViewById(R.id.title);
        noOfViewPage=26;
        //array for image name and media player both

        Toast.makeText(ctxMain, "menu="+menu, Toast.LENGTH_SHORT).show();
        switch (menu) {
            case 1 :  // for capital alphabets
                // variable contains image name
                title_tv.setText("Capital Alphabets");
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
                title_tv.setText("Small Alphabets");
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
                title_tv.setText("Animals");
                String tempArray3[]={"alligator","anteater","ape","bear","buffalo","camel","cheetah","chimpanzee","deer",
                "dinosaur","donkey","elephant","elephantseal","fox","giraffe","gorilla","hamster","hippopotamus","horse",
                        "hyena","jackal","jaguar","kangaroo","lion","mongoose","monkey","moose","panther","polarbear",
                        "porcupine","rabbit","raccoon","reindeer","rhinoceros","snake","tiger","ultrasaurus","walrus","yak","zebra"};
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
                title_tv.setText("Birds");
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
                title_tv.setText("Body Parts");
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
                title_tv.setText("Colors");
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
                title_tv.setText("Days");
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
                title_tv.setText("Fruits");
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
                title_tv.setText("Months");
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
                title_tv.setText("Numbers");
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
                title_tv.setText("Places");
                String tempArray11[]= {"airport","aquarium","beach","busstop","church","cinematheater",
                        "firestation","fuelstation","harbour","hospital","house","laboratory","library",
                "mosque","museum","policestation","postoffice","powerplant","railwaystation","restaurant",
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
                title_tv.setText("Profession");
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
                title_tv.setText("Shapes");
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
                title_tv.setText("Solar Systems");
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
            case 15 :  // for vegetales
                title_tv.setText("Vegetables");
                String tempArray15[]= {"artichoke","beetroot","bittergourd","broccoli","cabbage","capsicum","carrot",
                "cauliflower","celery","chayote","chilli","curryleaves","drumstick","eggplant","garlic","ginger",
                "greenbeans","ivygourd","ladiesfinger","limabeans","maize","mushroom","onion","pea","potato","pumpkin",
                "radish","ridgedgourd","scallion","spinach","yam","zucchini"};
                String tempArrayImgMp15[]=tempArray15;

                noOfViewPage=tempArray15.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray15[i];
                    mp_name[i] = tempArrayImgMp15[i];
                }
                break;
            case 16 :  // for vhicles
                title_tv.setText("Vehicles");
                String tempArray16[]= {"aeroplane","airballoon","ambulance","armytanker","auto","bicycle","bike",
                "boat","bullockcart","bus","car","caravel","chariot","chopper","concretemixer","crane2","dirtbike",
                "doubledeckerbus","fireengine","glider","helicopter","horsecart","iceboat","jeep","jet","kayak",
                "lorry","minibus","motorboat","narrowboat","offroad","pedalboat","policecar","proclain","rickshaw",
                "roadroller","rocket","scooter","ship","submarine","tankerlorry","taxi","tractor","train","tricycle",
                "truck","unicycle","van","yacht","zeppelin"};
                String tempArrayImgMp16[]=tempArray16;

                noOfViewPage=tempArray16.length;
                img_name=new String[noOfViewPage];
                mp_name=new String[noOfViewPage];
                for (int i=0;i<noOfViewPage;i++) {
                    img_name[i] = tempArray16[i];
                    mp_name[i] = tempArrayImgMp16[i];
                }
                break;
        }

        //set image resources by image name
        image_resource=new int[noOfViewPage];
        for (int i=0; i<noOfViewPage; i++) {
            image_resource[i]=this.getResources().getIdentifier(img_name[i], "drawable", this.getPackageName());
        }

        //set sound for alphabets

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
