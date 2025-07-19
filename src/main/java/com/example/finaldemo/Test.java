package com.example.finaldemo;

public class Test {
    public static void main(String[] args) {
        final double PI = 3.14;
        final Student s = new Student("张三", 18);
        //s = new Student();  final修饰的引用类数据类型地址不可改变
        s.setAge(24);
        s.setName("王五");
        System.out.println(s);
    }
}
