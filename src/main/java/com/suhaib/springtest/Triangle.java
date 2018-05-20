package com.suhaib.springtest;

public class Triangle {

    private String type;

    private int hight;

    public Triangle(String type, int height) {
        this.type = type;
        this.hight = height;
    }

    public void draw()  {
        System.out.println(getType() + " drawn with height : "+ hight);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
