package com.syntax.udemy;

public class YapiciSinifi {
    public static void main(String[] args) {
        new Akademisyen();


    }
}
class Akademisyen extends Calisan {
    public Akademisyen(){
        System.out.println("Akademisyen yapicisi calisti");
    }
}
class Calisan extends Insan{
    public Calisan(){
        this("Yuklenmis yapicisini cagiriyoruz");
        System.out.println("Calisanin yapicisi cagrildi.");
    }
    public Calisan(String s){
        System.out.println(s);
    }
}
class Insan{
    public Insan(){
        System.out.println("Insaninin yapicisi calisti");
    }
}
