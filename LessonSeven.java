/**
 * Java 1. Lesson 7
 *
 * @autor Stanislava P
 * @ version 06.02.2022
 */

import java.util.Arrays;

class LessonSeven {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Vasia", "Mauuu!!", 10),
                new Cat("Petya", "Mauuu!", 7),
                new Cat("Masya", "Mauuu!", 5)
        };

        Plate plate = new Plate(20, 30);
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.additive(20);
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.setIsFull(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Plate {
    private int food;
    private int remainder;

    Plate(int food, int remainder) {
        this.food = food;
        this.remainder = remainder;
    }

    boolean decreaseFood(int n) {
        if (food < n) {
            return false;
        }
        food -= n;
        return true;
    }

    void additive(int food) {
        if (this.food + food <= remainder) {
            this.food += food;
        }
    }


    @Override
    public String toString() {
        return "Plate: " + food;
    }
}

class Cat {
    private String name;
    private String voice;
    private int appetite;
    private boolean isFull;


    Cat(String name, String voice, int appetite) {
        this.name = name;
        this.voice = voice;
        this.appetite = appetite;
        isFull = false;
    }

    public void eat(Plate plate) {
        if (!isFull) {
            isFull = plate.decreaseFood(appetite);
        }
        if (!isFull) voice = "Maaau!";
        else voice = "Mrrr!";

    }


    void setIsFull(boolean hungry) {
        isFull = hungry;
    }

    @Override
    public String toString() {
        return "(name " + name + ", appetite " + appetite + ", isFull " + isFull + ", voice: " + voice + ")";
    }
}



