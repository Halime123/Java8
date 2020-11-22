package com.syntax.class27;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle tesla=new Tesla("red","x","90d");
        tesla.brake();
        tesla.drive();
        tesla.start();
        tesla.stop();
        System.out.println(Vehicle.totalVehicle);
    }
}
