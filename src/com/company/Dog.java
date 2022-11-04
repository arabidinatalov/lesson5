package com.company;

public class Dog {
    private String name;
    private String color;
    public Dog() {
    }
    public Dog(String name, String color){
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

