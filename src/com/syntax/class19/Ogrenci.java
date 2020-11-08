package com.syntax.class19;



public class Ogrenci {
    String name;
    Ogrenci(String name){
        this.name=name;

    }

    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci("Murat");
        System.out.println(ogrenci.name);
    }
}
