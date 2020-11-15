package com.syntax.class23;

public class PrevClassTask4 {
    double getArea(double len){
        return len*len;
    }
    double getArea(double len, double wid){
        return len*wid;
    }

    public static void main(String[] args) {
        PrevClassTask4 prevClassTask4=new PrevClassTask4();
        System.out.println(prevClassTask4.getArea(4));
        System.out.println(prevClassTask4.getArea(4,5));
    }
}
