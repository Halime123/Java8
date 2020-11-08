package com.syntax.class19;



public class Task4 {
    /*
    Write program that have static constructor and observe result.
     */
    int a;
    int b;

    Task4(int x,int y){
        a=x;
        b=y;
    }
    public static void main(String[] args) {
        Task4 task4=new Task4(2,8);
        System.out.println(task4.a+task4.b);

    }
}
