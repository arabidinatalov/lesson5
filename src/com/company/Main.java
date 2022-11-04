package com.company;

public class Main {
    public static void main(String[] args) {
      Course course = new Course("Java", "rahim agai", new Student("arabidin", 18, 34));
        System.out.println(course.getName() + " " + course.getInstructor() + " " + course.getStudent().getName()+" "
                +course.getStudent().getAge()+ " " +course.getStudent().getWords());
    }
}