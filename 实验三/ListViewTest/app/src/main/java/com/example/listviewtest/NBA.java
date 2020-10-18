package com.example.listviewtest;

public class NBA {
    private String name;
    private int imageId;

    public NBA(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
