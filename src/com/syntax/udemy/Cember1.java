package com.syntax.udemy;

import java.util.Date;

public class Cember1 extends GeometrikNesne {

    private double yaricap;
    public Cember1(){
        super();
        this.yaricap=yaricap;

    }
    public Cember1(double yaricap,String renk, boolean dolu){
        super(renk,dolu);
        this.yaricap=yaricap;

    }
    public double alanHesapla(){
        return yaricap*yaricap*Math.PI;
    }
    public double cevreHesapla(){
        return 2*yaricap*Math.PI;
    }
    public double getCap(){
        return 2*yaricap;
    }
    public void yazdir(){
        System.out.println(getOlusturmaTarihi()+" tarih olusturma ve yaricapi "+yaricap);
    }
    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
    public String toString(){
        return super.toString()+"yaricap"+yaricap;
    }
}
