package com.syntax.class16;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "Anna";
        String reverse="";
        for(int i =str1.length()-1;i>=0;i--){
            reverse+=str1.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("Is "+str1+" palindrome? "+reverse.equalsIgnoreCase(str1));
        StringBuilder stringbuilder=new StringBuilder("Anna");
        System.out.println(stringbuilder.reverse());
    }

}
