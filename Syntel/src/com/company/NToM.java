package com.company;

import java.util.Scanner;

public class NToM {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a start number: ");
        int n = scan.nextInt();
        System.out.println("Enter a end number: ");
        int m = scan.nextInt();
        scan.close();

        for(int i = n; i <= m; i++){
            System.out.println(i);
        }
    }
}
