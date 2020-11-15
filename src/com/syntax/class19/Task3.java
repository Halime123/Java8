package com.syntax.class19;

public class Task3 {
    /*
    Write a program  that will have 4 different access levels
    of constructors and create 3 objects of this class: 1 - inside same class;
     2 - from outside the class; 3 - from different class
     inside different package  and observe result.
     */
    int a;
    String s;
    char m;

    Task3(){
        System.out.println("First class");
    }
    private Task3 (int a){
        this.a=a;
      //  System.out.println(a);

    }
     public Task3(String s){
        this.s=s;
        // System.out.println(s);

    }
    protected Task3(char m){
        this.m=m;
       // System.out.println(m);

    }

    public static void main(String[] args) {
        Task3 task3=new Task3(6);
        System.out.println(task3.a);

        Task3 task31=new Task3("Halime");
        System.out.println(task31.s.toUpperCase());

        Task3 task32=new Task3('e');
        System.out.println(task32.m);


    }

    }






