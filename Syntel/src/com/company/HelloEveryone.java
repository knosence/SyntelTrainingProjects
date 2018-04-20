package com.company;

public class HelloEveryone {

//    Hello Everyone!
//
//    Create an array of Strings of five names with "Linda", "John", "Maya", "Nerine", "Gary"
//
//    Using a for each loop, output to the console this following result:
//
//    Hello there Linda!
//
//    Hello there John!
//
//    Hello there Maya!
//
//    Hello there Nerine!
//
//    Hello there Gary!
    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        String[] everyone = new String[] {"Linda", "John", "Maya", "Nerine", "Gary"};

        for(String one: everyone){
            System.out.printf("Hello there %s %n", one);
        }
    }
}
