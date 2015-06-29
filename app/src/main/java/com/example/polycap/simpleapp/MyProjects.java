package com.example.polycap.simpleapp;

/**
 * Created by Polycap on 6/27/2015.
 */
public class MyProjects {
    String title;
    String desc;
    int image;

    public MyProjects(String title, String desc, int image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }


    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }

}

