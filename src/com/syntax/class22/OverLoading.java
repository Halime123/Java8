package com.syntax.class22;



public class OverLoading {
    public void print() {
        System.out.println("print with no arguments");
    }

    public void print(String name, int num) {

        System.out.println("String name, int num");

    }
       public void print(int num, String name){
            System.out.println("int num, String name");
        }




    public static void main(String[] args) {
        OverLoading overLoading=new OverLoading();
        overLoading.print();
        overLoading.print("halime",12345);
        overLoading.print(12345,"ben");

    }
}
