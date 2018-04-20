package com.company;

import java.util.Scanner;

public class DaysOfTheWeek {

//    Using a hardcoded integer, print a day of the week using if and else statements. 0 for Sunday, 1 for Monday, 2 for Tuesday, and so on. Example output:
//
//    Int x = 5
//    output = Friday
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 0 thru 6 to get the day of the week:  ");

        int x = scan.nextInt();

        if(x == 0){
            System.out.println("Sunday");
        }else if(x == 1){
            System.out.println("Monday");
        }else if(x == 2){
            System.out.println("Tuesday");
        }else if(x == 3){
            System.out.println("Wednesday");
        }else if(x == 4){
            System.out.println("Tuesday");
        }else if(x == 5){
            System.out.println("Friday");
        }else if(x == 6 ) {
            System.out.println("Saturday");
        }else{
            System.out.println("Number not valid, please try again");
        }
        scan.close();
    }
}
