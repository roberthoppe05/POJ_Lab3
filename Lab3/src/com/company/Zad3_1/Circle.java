package com.company.Zad3_1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1;
        color = "Red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "Blue";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius = " + radius +
                " color = " + color;
    }
}
