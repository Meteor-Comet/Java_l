package com.多态;

public class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("Teacher{name = " + getName() + ", age = " + getAge() + "}");
    }
}
