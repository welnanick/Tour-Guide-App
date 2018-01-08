package com.nickwelna.tourguideapp;

/**
 * Created by Nick on 1/8/2018.
 */

public class Location {

    private String name;
    private String description;
    private int imageResourceId;

    public Location(String name, String description) {

        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean wordHasLargeImage() {
        return true;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
