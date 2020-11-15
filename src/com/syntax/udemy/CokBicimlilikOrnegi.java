package com.syntax.udemy;

public class CokBicimlilikOrnegi {
    public static void main(String[] args) {
        geometrikNesneYazdir(new Cember1(5.0,"Mavi",true));
        geometrikNesneYazdir(new Dikdortgen());
    }
    public static void geometrikNesneYazdir(GeometrikNesne gn){
        System.out.println("Olusturma tarihi "+gn.getOlusturmaTarihi()+"renk "+gn.getRenk()+" dolumu? "+
                gn.isDolu());

    }
}
