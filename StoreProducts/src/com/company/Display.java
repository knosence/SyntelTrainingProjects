package com.company;

import java.util.Scanner;

public class Display {
    Scanner scan = new Scanner(System.in);

    public int mainDisplay(){
        System.out.printf("Welcome to our store. %n%nFrom the selection, " +
                "Please enter the number that you want to use... %n" +
                "======================================================="+
                "For Vendors press 1%n" +
                "For Cart Options press 2%n" +
                "For ");

        int mainDisplaySelection = scan.nextInt();

        return mainDisplay();
    }


}
