package com.接口练习;

public class BasketballSporter extends Sporter{
    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName()+"学习篮球");
    }
}
