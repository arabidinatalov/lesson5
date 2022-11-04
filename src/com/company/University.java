package com.company;

public class University {

    private int id;
    private String name;
    private String country;
    private String location;
    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setCountry(String country){
        this.country=country;
    }
    void setLocation(String location){
        this.location=location;
    }
    String getName(){
        return name;
    }
    String getCountry(){
        return country;
    }
    String getLocation(){
        return location;
    }
}
