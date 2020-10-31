package com.syntax.class15;

public class ReplaceAll {
    public static void main(String[] args) {
        String mix="3423 Hello abschfrjrgjtjkjfkj";
        System.out.println(mix.replaceAll("[0-9]"," "));//number will not be printed.
        System.out.println(mix.replaceAll("[a-z]"," "));//lowercase letters will not be printed.
        System.out.println(mix.replaceAll("[^A-Za-z0-9]"," "));//replace empty ise but nothing demek.
    }
}
