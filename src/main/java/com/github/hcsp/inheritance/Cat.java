package com.github.hcsp.inheritance;

public class Cat extends Animal{


    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println("喵");
    }
}
