package com.company;

public class Triangle {
    int a;
    int b;
    int c;
    public double area() {
        double p = ((a + b + c)/2.0);
        double s = Math.sqrt(p * (p - a) * (p - c) * (p - b));
        return s;
    }
}
