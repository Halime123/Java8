package com.syntax.class22;

public class Repl126 {
    int num1;
    int num2;
    int num3;
    public static int numberofObjects=0;

    Repl126(int num1, int num2,int num3){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        numberofObjects++;
        //System.out.println(numberofObjects);

        }

    public static void main(String[] args) {
        Repl126 repl126=new Repl126(1,2,3);
        long total=numberofObjects;
        System.out.println(numberofObjects);

    }



        }






