package com.syntax.class16;

import java.util.Scanner;

public class HW1 {
    public static void createEmail(String name, String lastName, String email) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        name = Scan.nextLine().toLowerCase();
        System.out.println("Please enter your lastname:");
        lastName = Scan.nextLine().toLowerCase();
        System.out.println("Your email is"+name+lastName+"@gmail.com");
        //String createEmail(String firstName, String Lastname,String emailType){
        //return firstname+lastname+"@"+emailType+".com";
        //open new class


    }

}



