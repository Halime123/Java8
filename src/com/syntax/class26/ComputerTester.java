package com.syntax.class26;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] allComputersInSinglevar = {new Apple("Apple")
                ,new Lenovo("Lenovo"),
                new HP("HP")};
        for (Computer computer:allComputersInSinglevar){
            computer.run();
            computer.storage();
            computer.transfer();

        }
        Lenovo lenovo=new Lenovo("Lenovo");//special behaiour icin tekrar dan yazman gerekiyor
        lenovo.tabletMode();
    }
}