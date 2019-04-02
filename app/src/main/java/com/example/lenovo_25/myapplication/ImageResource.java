package com.example.lenovo_25.myapplication;

import android.content.Context;
import android.media.MediaPlayer;

import java.util.ArrayList;

/**
 * Created by Tarun Sinha on 2/20/2019.
 */

public class ImageResource {
    private int imageResource;
//    private ArrayList imageResource,
    private String imageName;
    private int mpName;
//    private int position;

    public ImageResource(int imageResource, String imageName, int mpName) {
        this.imageResource = imageResource;
        this.imageName = imageName;
        this.mpName = mpName;
//        this.position = position;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

 /*   public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }*/

    public int getMpName() {
        return mpName;
    }

    public void setMpName(int mpName) {
        this.mpName = mpName;
    }

    public void playSound(Context ctx) {
        MediaPlayer.create(ctx, mpName).start();
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
