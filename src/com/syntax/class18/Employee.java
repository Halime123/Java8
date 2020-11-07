package com.syntax.class18;

public class Employee {
    int empID;
    double salary;
    static String CEO;

    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.empID=123;
        employee1.salary=100000;
        Employee.CEO="Sumair";

        Employee employee2=new Employee();
        employee2.empID=12345;
        employee2.salary=960000;

        System.out.println(employee2.CEO);

    }
}
