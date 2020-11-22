package com.syntax.class27;

import com.syntax.class13.Car;

public abstract class Vehicle {
    String color;
    static int totalVehicle;
    Vehicle(){
        totalVehicle++;
        System.out.println("I will be called when ever an object of my child class"+
                "class will be created using no argument constructor");
    }
    Vehicle(String color){
        totalVehicle++;
        this.color=color;
        System.out.println("I will be called when ever an object of my child class"+
                "class will be created using no argument constructor");}
    public void drive(){
        System.out.println(" Vehicles drives");
    }
    public void stop(){
        System.out.println("Vehicle stops");
    }
    public abstract void start();
    public abstract void brake();
}
abstract class car extends Vehicle{
    String carType;
    car(String color, String carType){
        super(color);
        this.carType=carType;
    }

    @Override
    public void brake() {
        System.out.println(carType+"have brakes");
    }
}
class Tesla extends car{
    String make;
    Tesla(String color, String carType, String make) {
        super(color, carType);
        this.make=make;

    }

    @Override
    public void start() {
        System.out.println(make+"Can start remotely");
    }

    @Override
    public void drive() {
        System.out.println("Can drive on autopilot");
    }
}
class Toyota extends car{
    String make;
    Toyota(String color, String carType) {
        super(color, carType);
        this.make=make;
    }

    @Override
    public void start() {
        System.out.println(make+"can start without keys");
    }
}