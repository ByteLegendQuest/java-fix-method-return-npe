package com.bytelegend;

public class Cat {
    public String name;

    public Cat(String s) {
        name = s;
    }

    public static void main(String[] args) {
        Cat tom = createNewCat("Tom");
        System.out.println(tom.name);
    }

    public static Cat createNewCat(String s) {
        Cat c = new Cat(s);
        return c;
    }
}
