package com.syntax.class15;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String name=" Burju Maria Qasim";

        String [] array=name.split(" ");//seperate all the words if they have a space between.
        System.out.println(Arrays.toString(array));
        for(String name1: array){
            System.out.println(name1);
        }
    }
    }


