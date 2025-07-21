package com.接口练习;

public class BasketballCoach extends  Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(getName()+"教打篮球");
    }
}
