package com.company;

public class Fish {
    private String name;
    private String color;
    private int weight;
    Fish(String name, String color, int weight) {
        this.name = name;
        this.color=color;
        this.weight=weight;
    }
    String getName(){
        return name;
    }
    String getColor(){
        return color;
    }
    int getWeight(){
        return weight;
    }
}
