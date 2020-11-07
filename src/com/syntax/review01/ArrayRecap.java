package com.syntax.review01;

public class ArrayRecap {
    public static void main(String[] args) {
        int [][] intArr1=new int[3][4];
        intArr1[0][0]=23;
        intArr1[0][1]=12;
        intArr1[0][2]=23;
        int sum=0;
        for (int i = 0; i <intArr1.length ; i++) {
            for (int j = 0; j <intArr1[i].length ; j++) {
                sum=sum+intArr1[i][j];
                sum+=intArr1[i][j];

            }
            System.out.println(sum);
        }
    }
}
