package com.company.Zad3_1;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(4, "Yelow");
        Circle c4 =new Circle();
        c4.setRadius(7);
        c4.setColor("Brown");


        System.out.println("The circe c1 has radius of "+c1.getRadius() + " and area of " + c1.getArea() + " and color of " + c1.getColor());
        System.out.println(c1.toString());
        System.out.println("The circe c2 has radius of "+c2.getRadius() + " and area of " + c2.getArea() + " and color of " + c2.getColor());
        System.out.println(c2.toString());
        System.out.println("The circe c3 has radius of "+c3.getRadius() + " and area of " + c3.getArea() + " and color of " + c3.getColor());
        System.out.println(c3.toString());
        System.out.println("The circe c4 has radius of "+c4.getRadius() + " and area of " + c4.getArea() + " and color of " + c4.getColor());
        System.out.println(c4.toString());


    }
}
