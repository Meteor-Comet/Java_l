package com.questions.questions2;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18, "2024001");
        students[1] = new Student("李四", 19, "2024002");
        students[2] = new Student("王五", 20, "2024003");

        students = addStudent(students);
        students = deleteStudent(students);
    }

    public static int getCount(Student[] students){
        int count = 0;
        for(Student student: students){
            if(student!=null){
                count++;
            }
        }
        return count;
    }

    public static boolean contains(Student[] student, String id){
        for(Student s: student){
            if(s.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public static  Student[] addStudent(Student[] students){
        Scanner sc = new Scanner(System.in);
        int len = getCount(students);
        System.out.println("请输入要插入的学生信息:");
        while (true) {
            System.out.print("请输入学生姓名：");
            String name = sc.next();
            System.out.print("请输入学生年龄：");
            int age = sc.nextInt();
            System.out.print("请输入学生学号：");
            String id = sc.next();
            if(contains(students, id)){
                System.out.println("学号重复，请重新输入！");
            }
            else{
                students = Arrays.copyOf(students,len+1);
                students[len] = new Student(name, age, id);
                for(Student student: students){
                    System.out.println(student);
                }
                break;
            }
        }
        return students;
    }

    public static Student[] deleteStudent(Student[] students){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学号：");
        String id = sc.next();
        for(int i=0;i<students.length;i++){
            if (students[i].getId().equals(id)){
                students[i] = null;
                for(Student student:students){
                    System.out.println(student);
                }
                return students;
            }
        }
        System.out.println("学号不存在，删除失败");
        for(Student student:students){
            System.out.println(student);
        }
        return students;
    }
}
