package com.syntax.class26;

public abstract class Phone {
    public void makeCalls(){
        System.out.println("Phones makes call");
    }
    public void sendText(){
        System.out.println("phone send TXT");
    }
    public abstract void viewPicture();
    public abstract void unlock();

}
 class Iphone extends Phone{

     @Override
     public void viewPicture() {
         System.out.println("we can checkout photos using the photos app");
     }

     @Override
     public void unlock() {
         System.out.println("unlock with face");

     }
 }
 class Samsung extends Phone{

     @Override
     public void viewPicture() {
         System.out.println("to view picture use the galeria");
     }

     @Override
     public void unlock() {
         System.out.println("unlock using the password");

     }
 }
