package com.集合;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            Student s = new Student();
            System.out.println("请输入第" + (i+1) + "个学生的姓名：");
            String name = sc.next();
            s.setName(name);
            System.out.println("请输入第" + (i+1) + "个学生的年龄：");
            int age = sc.nextInt();
            s.setAge(age);
            students.add(s);
        }
        for(Student s:students){
            System.out.println(s);
        }
    }
}
