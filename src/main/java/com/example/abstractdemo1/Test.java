package com.example.abstractdemo1;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("青蛙",1);
        Dog dog = new Dog("狗",6);
        Sheep sheep = new Sheep("羊",4);
        frog.eat();
        dog.eat();
        sheep.eat();
    }
}
