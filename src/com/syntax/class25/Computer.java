package com.syntax.class25;



public class Computer {
    String name;
    int a;
    public void print(String name, int a){

        System.out.println(name+a);
    }

    public void name() {
    }
}
    class Apple extends Computer{
    public void print(String name, int a){
        a=2;
        name="Macbook";
        System.out.println(name+a);
    }

    }
    class Lenovo extends Computer{
        public void print(String name, int a){
            a=1996;
            name="Laptop";
            System.out.println(name+a);
        }
    }
    class HP extends Computer{
        public void print(String name, int a){
            a=2000;
            name="TV";
            System.out.println(name+a);
        }
    }
    class Dell extends  Computer{

        public void print(String name, int a){
            a=2001;
            name="Com";
            System.out.println(name+a);
        }
    }
    class Main{
        public static void main(String[] args) {
            Computer main=new Computer();
            Computer [] AllComputers={new Dell(),new Lenovo(),new HP(),new Apple()};
            for (Computer computer:AllComputers) {

                computer.print("com",5);



            }

        }
    }