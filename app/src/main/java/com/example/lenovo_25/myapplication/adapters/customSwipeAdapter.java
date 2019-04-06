package com.example.lenovo_25.myapplication.adapters;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lenovo_25.myapplication.ImageResource;
import com.example.lenovo_25.myapplication.R;

import java.util.ArrayList;

/**
 * Created by Tarun Sinha on 2/19/2019.
 */

public class customSwipeAdapter extends PagerAdapter {

    public static int pos=0;
    private int[] image_resource;
    private String[] img_name;
//    ImageResource imageResource;
    ArrayList<ImageResource> resources;
//    ArrayList<MediaPlayer> mps;
    private Context ctx;
    public static MediaPlayer mp;
    private LayoutInflater layoutInflater;

    public customSwipeAdapter(Context ctx, ArrayList<ImageResource> imageResource) {
        this.ctx = ctx;
        this.resources=imageResource;
      /*  mps=new ArrayList<>();
        for (int i=0; i<imageResource.size(); i++) {
            Log.d("adapter", "mp=" + imageResource.get(i).getImageName() + " i=" + i);
            mps.add(MediaPlayer.create(ctx, imageResource.get(i).getMpName()));
        }*/
//        this.imageResource=imageResource;
//        this.image_resource=imageResource.getImageResource();
//        this.img_name=imageResource.getImageName();
    }

    @Override
    public int getCount() {
        return resources.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view=layoutInflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView=(ImageView) item_view.findViewById(R.id.image_view);
        TextView textView=(TextView) item_view.findViewById(R.id.text_view);


//        Log.d("itempos","pos="+pos+" position="+position);
//        if (pos==position) {
//            MediaPlayer.create(ctx, resources.get(position).getMpName()).start();
//        }
//        else if (position>pos) {
//            pos++;
//            MediaPlayer.create(ctx, resources.get(position - 1).getMpName()).start();
//        }
//        else {
//            pos--;
//            mp=MediaPlayer.create(ctx, resources.get(pos).getMpName());
//        }
//        resources.get(pos).playSound(ctx);

//        Log.d("position","position="+position+"imgname="+resources.get(position).getImageName());
//        mps.get(position).start();
//        if (imageResource.getLength()<=position) {
//            MediaPlayer.create(ctx, resources.get(position).getMpName());
//        resources.get(position).playSound(ctx,resources.get(position).getMpName());
            textView.setText((position + 1) + ". " + resources.get(position).getImageName());
            imageView.setImageResource(resources.get(position).getImageResource());
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.start();
                }
            });


//        }
        container.addView(item_view);

        return item_view;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
