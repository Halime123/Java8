package com.syntax.class16;

import java.util.Arrays;

public class ReversedWords {
    public static void main(String[] args) {
        String sentence="What did u use the most?";
        String [] stringArray=sentence.split(" ");

        System.out.println(Arrays.toString(stringArray));
        for (int i = 0; i <stringArray.length ; i++) {
             StringBuilder stringBuilder=new StringBuilder(stringArray[i]);
             stringArray[i]=stringBuilder.reverse().toString();
        }
        System.out.println(Arrays.toString(stringArray));

    }
}
