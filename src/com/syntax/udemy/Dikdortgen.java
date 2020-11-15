package com.syntax.udemy;

import java.util.Date;

public class Dikdortgen extends GeometrikNesne {

    private double genislik;
    private double yukseklik;
    public double alanHesapla(){
        return genislik*yukseklik;
    }
    public double cevreHesapla(){
        return 2*(genislik+yukseklik);
    }
    public void yazdir(){
        System.out.println(getOlusturmaTarihi()+" tarih olusturma ve genislik "+genislik+"yukseklik"+
                yukseklik);
    }


    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }
}
