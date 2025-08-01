package com.重写;

public class Chef extends Employee{
    public Chef() {
    }

    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师做饭");
    }
}
