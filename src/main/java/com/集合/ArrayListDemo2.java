package com.集合;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        for(Student s:students){
            System.out.println(s);
        }
    }
}
