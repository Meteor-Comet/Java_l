package 数据结构.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        for(Student s:lhs){
            System.out.println(s);
        }
    }

}
