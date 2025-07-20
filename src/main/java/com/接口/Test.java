package com.接口;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("狗", 5);
        Frog frog = new Frog("青蛙", 2);
        Rabbit rabbit = new Rabbit("兔子", 1);
        dog.eat();
        dog.swim();
        frog.eat();
        frog.swim();
        rabbit.eat();
    }
}
