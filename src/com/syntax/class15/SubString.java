package com.syntax.class15;

public class SubString {
    public static void main(String[] args) {
        String name="write the second m too ";
        System.out.println(name.substring(5));//ignores first 5 characters.
        System.out.println(name.substring(5,10));
        System.out.println(name.substring(5,10)+name.substring(5,10));
    }
}
