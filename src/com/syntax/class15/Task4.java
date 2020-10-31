package com.syntax.class15;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String string=new String("We are here to study and to be friends");
        System.out.println(string.replace(" ",""));
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(string.replaceAll("[^A-Za-z]",""));
        System.out.println("number of sentences "+a.length());
        String number="1234 ABCD @@@@";
        System.out.println(number.replaceAll("[^0-9]"," "));
        System.out.println(number.replaceAll("[^0-9]","").length());

    }
}
