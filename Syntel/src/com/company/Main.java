package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        C to F
//
//        Hardcode a number in degrees Celsius, and convert the value to degrees in Fahrenheit and display it to the user. Example session:
//
//        Temperature in C? 28
//        82.4 F
//
//        Temperature in C? -5
//        23 F


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Temperature to be convert to F:  ");
        double degree = scan.nextDouble();

        System.out.println("28 Degrees C would be converted to : " + (degree*1.8+32) + " Degrees F");

        scan.close();
    }

}