package com.company;

public class Student {
    private String name;
    private int age;
    private int words;
    public Student(String name, int age, int words){
        if(age<16){
            System.out.println(name + " okuuga mumkunchulugu jok ");
            this.name=name;
            this.age=0;
            this.words=-words;
        }
        this.name=name;
        this.age=age;
        this.words=-words;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    int getWords(){
        return words;
    }
}
