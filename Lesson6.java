/**
* Java 1. Lesson 6
* @autor Stanislava P
* @ version 02.02.2022
*/

import java.util.Arrays;

class Lesson6 {
    public static void main(String[] args) {
        IAnimal[] animals = {new Cat("Lion", 200, 0), new Dog("Volf", 500, 10)
        };
        for (IAnimal animal:animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(500));
            System.out.println(animal.run(700));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
    }
}

class Cat extends Animal {
    Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }

    @Override
    public String swim(int distance) { 
        return name + "can't swim ";
    }
}

class Dog extends Animal {
    Dog(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    Animal(String name,  int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return name + " did not run " + distance;
        } else {
            return name + " run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return name + " can't swim " + distance;
        } else {
            return name + " swam " + distance;
        }
    }
    @Override
    public String toString() {
        return  name + ". runLimit: " + runLimit + ", swimLimit: " + swimLimit;
    }
}

interface IAnimal {
    public String run(int distance);
    public String swim(int distance); 
    }
