package com.company;

public class Cat {
    private String name;
    private String color;
    public Cat(){

    }
    public Cat(String name, String color){
        this.name=name;
        this.color=color;
    }
    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }
}
