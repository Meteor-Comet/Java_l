package 数据结构;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hello");
        set.add("world");
        set.add("java");
        for (String s : set) {
            System.out.println(s);
        }

        set.forEach(System.out::println);
    }
}
