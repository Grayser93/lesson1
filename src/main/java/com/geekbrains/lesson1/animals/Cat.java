package com.geekbrains.lesson1.animals;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + " мяу");
    }

    public  void  catMethod() {
        System.out.println("catMethod");
    }

    @Override
    public String toString() {
        return "CAT [" + name + " " + color + " " + age + "]";
    }
}