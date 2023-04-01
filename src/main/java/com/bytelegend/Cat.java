package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat tom = createNewCat("Tom");
        System.out.println(tom.name);
    }

    public static Cat createNewCat(String name) {
        return new Cat(name);
    }
}
