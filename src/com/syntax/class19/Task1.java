package com.syntax.class19;

public class Task1 {
    /*
    Write a program that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */
    int age;
    int idNumber;
    Task1() {//default
        System.out.println(" no special");
    }

    Task1(int ageValue, int idNumberValue) {
        age = ageValue;
        idNumber = idNumberValue;
    }

    public static void main(String[] args) {
        Task1 yes=new Task1(30,12);
        Task1 yes2=new Task1(30,12);
        System.out.println(yes.age+" "+yes.idNumber);
    }


    }











