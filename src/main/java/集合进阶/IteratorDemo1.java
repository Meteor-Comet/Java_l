package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("ddd");
        c.add("eee");

        for (String s : c) {
            System.out.println(s);
        }

        c.forEach(System.out::println);
    }
}
