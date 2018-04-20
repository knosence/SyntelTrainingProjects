package com.Feb28;

public class Vehicle {
    private String owner;
    private int year;
    private String model;

    private Vehicle(String owner, int year, String model){
        this.owner = owner;
        this.year = year;
        this.model = model;
    }

    public String toString(){
        return String.format("The owner of the %d and %s is %s.",
                this.year,
                this.model,
                this.owner);
    }

    public static void main(String[] args){
        Vehicle myCar = new Vehicle("Nadario", 2007, "Altima");

        System.out.println(myCar.toString());
    }
}
