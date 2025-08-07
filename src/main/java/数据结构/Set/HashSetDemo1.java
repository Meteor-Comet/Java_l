package 数据结构.Set;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 18);
        Student s3 = new Student("王五", 20);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(3);
        System.out.println(set1);
    }
}
