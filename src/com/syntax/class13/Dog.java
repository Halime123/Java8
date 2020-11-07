package com.syntax.class13;

public class Dog {

    //write some of the attribute that a dog can have
    String breed;


    String color;
    String name;


    public void bark(){
        System.out.println(name+" can bark");
    }
    void play(){

        System.out.println(name+" can play");
    }
    void run() {
        System.out.println(name+" can run");
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.breed="husky";
        d1.name="Husky";
        d1.color="White";
        d1.bark();
        d1.play();
        d1.run();

        d1.breed="Bulldog";
        d1.name="Bulldog";
        d1.color="White";
        d1.bark();
        d1.play();
        d1.run();

        d1.breed="Labrador";
        d1.name="Labrador";
        d1.color="White";
        d1.bark();
        d1.play();
        d1.run();


    }
}
