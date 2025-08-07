package 数据结构.Set;

import java.util.TreeSet;

public class TreeSetDemo3{
    public static void main(String[] args){
        TreeSet<String> s = new TreeSet<>((o1, o2)-> {
                int strSize = o1.length() - o2.length();
                if(strSize != 0){
                    return strSize;
                }
                return o1.compareTo(o2);
        });
        s.add("hello");
        s.add("world");
        s.add("java");
        s.add("python");
        s.add("aaaaaa");
        s.add("bbbbbb");
        System.out.println(s);
    }

}
