package com.questions.questions2;

public class Student {
    private String name;
    private int age;
    private String id;

    public Student() {
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", id = " + id + "}";
    }
}
