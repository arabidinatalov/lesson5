package com.company;

public class Course {
    private String name;
    private String instructor;
    Student student;
    public Course(String name, String instructor, Student student) {
        if (name.length() <= 2) {
            System.out.println(" coursetun aty 2 tamgadan kop boluusu kerek");
            this.name = null;
            this.instructor = instructor;
            this.student = student;
        } else {
            this.name = name;
            this.instructor = instructor;
            this.student = student;
        }
    }
    String getName(){
        return name;
    }
    String getInstructor(){
        return instructor;
    }
    public Student getStudent(){
        return student;
    }
}
