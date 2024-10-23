package com.geekbrains.lesson1;

import com.geekbrains.lesson1.animals.Animal;
import com.geekbrains.lesson1.animals.Cat;
import com.geekbrains.lesson1.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
//        Cat cat = new Cat("Барсик", "Белый", 2);
//        Cat cat2 = new Cat("Мурзик", "Чёрный", 4);
//        Dog dog = new Dog("Бобик", "Белый", 2);
//
//        cat.info();
//        cat2.info();
//
//        dog.voice();
//        cat.voice();

//        Animal animal = new Cat("A", "B", 1);
//        animal.voice();

//        Animal[] catsAndDogs = {
//                new Cat("Барсик", "Белый", 1),
//                new Dog("Бобик", "Белый", 1),
//        };
//        for (Animal o : catsAndDogs) {
//            o.voice();
//        }

//        Animal cat = new Cat("A", "A", 1);
//        if (cat instanceof Cat) {
//            ((Cat) cat).catMethod();
//        } else {
//            System.out.println("не кот");
//        }

        Cat cat = new Cat("a", "A", 2);
        System.out.println(cat);
    }
}
