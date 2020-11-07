package com.syntax.class19;

public class Employee {
    int number;
     String name;
     char character;
    double decimal;
    Employee(){
        System.out.println("I will be called every time you create an object of this class.");
    }
    Employee(int numberValue, String nameValue,char characterValue){
        System.out.println("I am not a useless constructor");
        if(numberValue>60){
            System.out.println("Please retire");
        }else{
            name=nameValue;
            number=numberValue;
            character=characterValue;
        }


    }
     void  print(){
        System.out.println(number+name+character+decimal);
    }

    public static void main(String[] args) {
         Employee employee=new Employee();
        Employee constructors2=new Employee(100,"Vlad",'A');
         constructors2.print();

           //constructors.print();
       // int num;
        //System.out.println(num);
    }
}
