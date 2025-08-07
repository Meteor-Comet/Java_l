package 数据结构.Set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(5);
        ts.add(4);
        ts.add(2);
        ts.add(1);
        System.out.println(ts);
    }
}
