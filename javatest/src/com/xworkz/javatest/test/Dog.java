package com.xworkz.javatest.test;

public class Dog  extends Animal{

    @Override
    public void sound() {
        
        super.sound();
        System.out.println("Dog barks.");
    }
}
