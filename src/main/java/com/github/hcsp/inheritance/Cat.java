package com.github.hcsp.inheritance;

public class Cat extends Mammal{

    public Cat(String name) {
        setName(name);
    }

    public void meow() {
        System.out.println("喵");
    }
}
