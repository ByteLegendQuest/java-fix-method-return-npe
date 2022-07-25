package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        System.out.println(tom.name);
    }

    public static Cat createNewCat(String name) {
        Cat cat = new Cat(name);
        return null;
    }
}
