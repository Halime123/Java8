package com.syntax.class22;

class Vehicle {
    int maxSpeed;
   // public void vroom(){
        //System.out.println("Vroom Vroom");
    Vehicle(){
        System.out.println("vehicle");

    }
    Vehicle(int maxSpeed ){
        System.out.println("vehicle/speed");
        this.maxSpeed=maxSpeed;

}
static class car extends Vehicle{
   //public  void vroom(){
      // super.vroom();
    car(){
        super();
       // System.out.println("we are in constructor!");

    }

}
static class Main{
    public static void main(String[] args) {
        car car=new car();


    }
}}
