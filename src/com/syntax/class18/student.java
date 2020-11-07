package com.syntax.class18;

public class student {
    String studentName;
    int studentID;
    static int numberOfStudents;

    public static void main(String[] args) {
        student student1=new student();
        student1.studentName="Moneer";
        student1.studentID=123;
        student.numberOfStudents++;
        System.out.println(student1.studentName);
        System.out.println(student1.studentID);
        System.out.println(student1.numberOfStudents);

        student student2=new student();
        student2.studentName="Davit";
        student2.studentID=12345;
        student.numberOfStudents++;
        System.out.println(student2.studentName);
        System.out.println(student2.studentID);
        System.out.println(student2.numberOfStudents);



    }
}
