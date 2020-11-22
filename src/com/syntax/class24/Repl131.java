package com.syntax.class24;

public class Repl131 {
    static String s1;
    static String s2;

    static String mixString(String s1, String s2){
       // System.out.println(s1+s2);
        StringBuilder result=new StringBuilder();
        for (int i = 0; i <s1.length()||i<s2.length() ; i++) {
            if (i < s1.length())
                result.append(s1.charAt(i));
            if (i < s2.length())
                result.append(s2.charAt(i));
        }

        return result.toString();

    }




       //String s1="12345";
       //String s2="abcde";
        //System.out.println(mixString(s1, s2));
        public static void main(String[] args){
            String firstValue = mixString("12345","abcde");
            System.out.println(firstValue);
            String secondValue = mixString("howdy","hello");
            System.out.println(secondValue);
    }
 }
