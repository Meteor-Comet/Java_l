package 数据结构;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 24);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("重复", 20);
        TreeSet<Student> students = new TreeSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        for(Student s:students){
            System.out.println(s);
        }
    }
}
