package com.example.advancedconceptsinrecycleview.Model;

public class Planet {

    private String planetname;
    private int image;
    private int distancefromsun;
    private int gravity;


    public Planet(String planetname, int image, int distancefromsun, int gravity) {
        this.planetname = planetname;
        this.image = image;
        this.distancefromsun = distancefromsun;
        this.gravity = gravity;
    }


    public String getPlanetname() {
        return planetname;
    }

    public void setPlanetname(String planetname) {
        this.planetname = planetname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getDistancefromsun() {
        return distancefromsun;
    }

    public void setDistancefromsun(int distancefromsun) {
        this.distancefromsun = distancefromsun;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }
}
