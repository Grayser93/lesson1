package com.geekbrains.lesson1.animals;

public class Dog extends Animal {
    public Dog() {

    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println(name + ": гав-гав");
    }
}
