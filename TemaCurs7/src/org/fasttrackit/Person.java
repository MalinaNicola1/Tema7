package org.fasttrackit;

public class Person {

    String name;
    int age;
    boolean married;


    public Person(String name, int age,boolean married){
        this.name = name;
        this.age = age;
        this.married =married;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String isMarried() {
        if (this.married == true )
            return "is married";
        else
            return "isn't married";
    }

    public String toString() {

        return name + " is " + age + " y.o " + " and " + married;


    }
}
