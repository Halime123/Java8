package com.syntax.class19;

public class Student {
    String name;
    double subject1;
    double subject2;
    double subject3;
    Student(String nameValue,double subject1Value, double subject2Value,double subject3Value){
        name=nameValue;
        subject1=subject1Value;
        subject2=subject2Value;
        subject3=subject3Value;
    }
    void printGradeAverage(){
        double avg=(subject1+subject2+subject3)/3;
        System.out.println("Average marks for "+name+" "+avg);
    }

    public static void main(String[] args) {
        Student student1=new Student("Marta",93,90,91);
        student1.printGradeAverage();
        Student student2=new Student("Jack",87,80,97);
        student2.printGradeAverage();
        Student student3=new Student("Danilo",100,100,100);
        student3.printGradeAverage();
        Student student4=new Student("Nabin",100,100,92);
        student4.printGradeAverage();

    }
}
