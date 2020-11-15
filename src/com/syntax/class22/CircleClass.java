package com.syntax.class22;

public class CircleClass extends ShapeClass {
    double pi;
    double area;

    CircleClass(double radius) {
        super(radius);


    }
    public void calculateArea(){
        double area=3.14*radius*radius;
        System.out.println(area);
    }

    public static void main(String[] args) {
        CircleClass circleClass=new CircleClass(.5);
        circleClass.calculateArea();
    }
}
