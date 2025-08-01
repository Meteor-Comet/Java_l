package com.test1;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.show();
        System.out.println("------------------");
        student1.setName("张三");
        student1.setAge(18);
        student1.show();
        System.out.println("------------------");
        Student student2 = new Student("李四", 19);
        student2.show();
    }
}
