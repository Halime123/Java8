package com.syntax.udemy;

import java.util.concurrent.Callable;

public class TestCember {
    public static void main(String[] args) {
        Cember cember1=new Cember();
        cember1.yaricapiGuncelle(56.69);
        System.out.println(cember1.alanHesapla());

        Cember cember2=new Cember();
        cember2.yaricapiGuncelle(1);
        System.out.println(cember2.alanHesapla());





    }
}
