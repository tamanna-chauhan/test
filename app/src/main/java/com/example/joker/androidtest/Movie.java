package com.example.joker.androidtest;

public class Movie {

    String name, id;
    private int image;


    //TODO 6 Create setters and getters

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Movie(String name) {
        this.image = image;
        this.id = id;
        this.name = name;

    }

}
