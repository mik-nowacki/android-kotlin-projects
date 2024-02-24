package com.example.bucketlist;


import androidx.annotation.DrawableRes;

public class RecyclerItem {

    String name;
    String description;
    int image;

    public RecyclerItem(String name, String description, @DrawableRes int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

}

