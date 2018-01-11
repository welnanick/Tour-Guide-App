package com.nickwelna.tourguideapp;

public class Location {

    private int name;
    private int description;
    private int imageResourceId;
    private boolean largeImage = false;
    private int searchQuery;

    public Location(int name, int description, int imageResourceId, int searchQuery) {

        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.searchQuery = searchQuery;

    }

    public Location(int name, int description, int imageResourceId, boolean largeImage, int searchQuery) {

        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.largeImage = largeImage;
        this.searchQuery = searchQuery;

    }

    public int getName() {

        return name;

    }

    public int getDescription() {

        return description;

    }

    public boolean hasLargeImage() {

        return largeImage;

    }

    public int getImageResourceId() {

        return imageResourceId;

    }

    public int getSearchQuery() {

        return searchQuery;

    }

}
