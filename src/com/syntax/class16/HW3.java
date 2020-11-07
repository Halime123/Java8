package com.syntax.class16;

import com.syntax.class11.HW2;

public class HW3 {
    //public static void main(String[] args) {
    // HW1 hw1=new HW1();
    //hw1.createEmail("Ahmed","Qasim","gmail");
    //sout email;
    //HW2 prime=new HW2();
    //boolean prime= HW2.isPrime(25);
    char getGrade(int marks) {
        char grade;
        if (marks > 90 && marks <= 100) {
            grade = 'A';

        } else if (marks > 80) {
            grade = 'B';

        } else if (marks > 70) {
            grade = 'C';
        } else if (marks > 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        HW3 task3=new HW3();
        //task3.getGrade(90);
        System.out.println(task3.getGrade(67));
    }
}

