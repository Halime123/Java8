package com.syntax.udemy;

public class Cember {

    double yaricap;
    Cember(){
        yaricap=5;

    }

    double alanHesapla(){
        return yaricap*yaricap*Math.PI;

    }
    double cevreHesapla(){
        return 2*Math.PI*yaricap;
    }

    double yaricapiGuncelle(double y){
        yaricap=y;
        return y;
    }
}
