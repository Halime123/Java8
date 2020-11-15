package com.syntax.class23;

public class PrevClassTask3 {
    private void print(){
        System.out.println("I am a private method. I have no parameters.,");
    }
    private void print(int var){
        System.out.println("I am a private methodI have one int parameters.,");
    }
    private void print(String var){
        System.out.println("I am a private methodI have string parameters.,");
    }

    public static void main(String[] args) {
        PrevClassTask3 prevClassTask3=new PrevClassTask3();
        prevClassTask3.print();
        prevClassTask3.print(10);
        prevClassTask3.print("abc");
    }
}
