package com.syntax.tekrar;

public class Main2 {
    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args) {
        Main2 car= new Main2();
        car.carColor="Black";
        car.carYear=2019;
        car.carMake="BMW";
        System.out.println("Car color is "+car.carColor+" and car year is "+car.carYear+ " and car model is "+car.carMake);
        car.carColor="White";
        car.carYear=2018;
        car.carMake="Toyota";
        System.out.println("Car color is "+car.carColor+" and car year is "+car.carYear+ " and car model is "+car.carMake);
    }
}
