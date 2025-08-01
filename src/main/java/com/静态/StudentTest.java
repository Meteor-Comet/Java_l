package com.静态;

import com.util.StudentUtil;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("张三", 18, "男");
        Student s2 = new Student("李四", 19, "女");
        Student s3 = new Student("王五", 20, "男");
        students.add(s1);
        students.add(s2);
        students.add(s3);

        int maxage = StudentUtil.getMaxAge(students);
        System.out.println("最大年龄是："+maxage);
    }
}
