package com.company;

public class SumOfNumberOneToHundred {
    public static void main(String[] args){
        int count = 1;
        int sum = 0;

        do{
            sum += count;
            System.out.println(sum);
            count++;
        } while(count <= 100);
    }
}
