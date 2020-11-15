package com.syntax.class23;

class Bank{
    double bankBalance;
    public Bank(double bankBalance) {
        this.bankBalance = bankBalance;
    }
    void printTransferFee(){
        System.out.println(bankBalance*0.1);
    }

   class BOA extends Bank {
       public BOA(double bankBalance) {
           super(bankBalance);
       }


       void printTransferFee(){

        }

   }

}
public class Overriding {
    public static void main(String[] args) {
        //write the class and print it.
    }

}
