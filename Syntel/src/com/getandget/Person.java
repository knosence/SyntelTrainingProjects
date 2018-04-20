package com.getandget;

public class Person {
    static final String teamName = "Mango";
    static final String inCommon = "Information Technology";

    private String name;
    private int age;
    private String hobby;

    public Person(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getHobby(){
        return hobby;
    }
}


