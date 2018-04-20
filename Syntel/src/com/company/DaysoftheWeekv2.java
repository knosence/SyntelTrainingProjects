package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class DaysoftheWeekv2 {

    public static void main(String[] args){
//        Using a hardcoded integer provided integer print "Go to work" if it's a work day and "Sleep in" if it's a weekend day. Instead of else if statements, Use switch case statements. Example session:
//
//        Example 1
//
//        Int x = 5
//        OUTPUT
//        Go to work
//
//        Example 2
//
//        Int x = 4
//
//        OUTPUT
//
//        Sleep in

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 0 thru 6 to see if you go to work or sleep in:  ");

        int x = scan.nextInt();
        scan.close();


        switch(3) {
            case 0: case 6:
                System.out.println("Sleep in");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Go To Work");
                break;

        }
    }
}


