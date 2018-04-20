package com.Feb28;

public class Test{

    public static void main (String [] args){
        Person person1 = new Person ("Nadario", "nadario.seays@gmail.com", 4702659368L);

        person1.printGreeting("Marcus");

        System.out.println(person1.getEmail());
        System.out.println(person1.getPhone());
    }

}
