package com.getandget;
public class Main {

    public static void main(String[] args){
        Person memberOne = new Person("Nadario", 29, "Leaning new things");
        Person memberTwo = new Person("Hill", 38, "Nothing makes Hill happier than coding");
        Person memberThree = new Person("Mayur", 25, "Programming");
        Person memberFour = new Person("Azadeh", 0, "Watching movies, Dancing, Cooking");


        Person[] mangoTeam = new Person[] {memberOne, memberTwo, memberThree, memberFour};
        System.out.println();

        for(Person teammember: mangoTeam){
            System.out.printf("%s is apart of Team %s, who all have %s in common, this member's age is %d, and his'/her's hobbies are %s. %n",
                    teammember.getName(),
                    Person.teamName,
                    Person.inCommon,
                    teammember.getAge(),
                    teammember.getHobby()
                    );
        }
    }
}
