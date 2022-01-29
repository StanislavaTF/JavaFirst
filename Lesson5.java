/**
* Java 1. Lesson 5
* @autor Stanislava P
* @ version 29.01.2022
*/

import java.util.Arrays;


class Lesson5{

    public static void main(String[] args) {
        Person[] persArray = {
            new Person("Yo Ho Ho", "tsar", "tsar@tsar.bk", "9999999", 100000000, 60),
            new Person("Yo Ho He", "queen", "queen@tsar.bk", "9999998", 99000000, 50),
            new Person("Yo Ho Ha", "princess", "princess@tsar.bk", "9999997", 50000000, 30),
            new Person("Yo Ho Hi", "prince", "prince@tsar.bk", "9999996", 50000000, 25),
            new Person("Yuhu", "chancellor", "chancellor@tsar.bk", "5555555", 500000, 57)}
            ;

        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() >= 40){
                System.out.println("Age over 40 year: " + (persArray[i]));
            }
        }
    }
} 
class Person {
    private String name;
    private String position;
    private String email;
    private String telephon;
    private int salary;
    private int age;

    Person(String name, String position, String email, String telephon, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephon = telephon;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person:"+ name + ", "+ position + ", "+ email +", "+ telephon + ", "+ salary +", "+ age;
    }
}


