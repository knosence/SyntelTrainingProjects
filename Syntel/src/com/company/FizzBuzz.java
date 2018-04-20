package com.company;

public class FizzBuzz {
    //    FizzBuzz
//    Dealing with Loops, FizzBuzz
//    Write a Java program which iterates the integers from 1 to 60.
//    For multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
//    For numbers which are multiples of both three and five print "FizzBuzz".
//    For example:
//     1
//     2
//    Fizz
//     3
//    Buzz
//    Fizz
//    And so on
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
