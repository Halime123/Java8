package com.syntax.class22;

public class Main {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe("Nike",10);
        System.out.println(shoe1.brand+shoe1.size);
        Walking w=new Walking(true,"Adidas",10);
        System.out.println(w.goreTex);
        Running running=new Running(80,"Kit",12);
        System.out.println(running.weigth);
        System.out.println("====================");



    }
}