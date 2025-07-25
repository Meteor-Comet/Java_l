package com.example.abstractdemo;

public abstract class Person {
    private String name;
    private int age;

    public Person(){
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public abstract void work();

    public void eat() {
        System.out.println("吃吃吃");
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
