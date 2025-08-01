package com.test1;

public class Animal {
    private String brand;
    private String name;
    private int age;

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show()
    {
        System.out.println(" name:" + name + "brand:" + brand + " age:" + age);
    }
}
