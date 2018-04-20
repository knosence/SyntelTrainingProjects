package com.Feb28;

public class Person{

    private String name;

    private String email;

    private long phone;

//constructor


    public Person(String name, String email, long phone){

        this.name = name;

        this.email = email;

        this.phone = phone;

    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public long getPhone(){
        return phone;
    }


    public void printGreeting(String name){

        System.out.println("Hello "+name+ ", im " +this.getName());

    }

}