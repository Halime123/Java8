package com.syntax.class16;

public class Numbers {
    public void num(){
        System.out.println();

    }
    public static void printLarger(double num1, double num2){
        if(num1>num2){
            System.out.println(num1);
        }else if(num2>num1){
            System.out.println(num2);
        } else{
            System.out.println("Numbers are equal");
        }
        return;
    }

}
