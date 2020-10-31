package com.syntax.class15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String mom, dad, baby;
        System.out.println("Mom's first name? ");
        mom=input.nextLine();
        System.out.println("Dad's first name?");
        dad=input.nextLine();
        System.out.println("Boy or Girl?");
        baby=input.nextLine();
        /*
        if(baby.tolowerCase().startsWith("b"){
        first part=dad.substring(0,dad.length()/2
        second part=mom.substring(mom.length()/2

         */
        if(baby.equalsIgnoreCase("boy")){
            System.out.println(dad.substring(0,3)+mom.substring(2));
        } else if(baby.equalsIgnoreCase("girl")) {
            System.out.println(mom.substring(0,2)+dad.substring(3));

        }else{
            System.out.println("Try again");

        }

    }
}
