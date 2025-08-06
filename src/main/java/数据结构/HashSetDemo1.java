package 数据结构;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("张三", 18);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
