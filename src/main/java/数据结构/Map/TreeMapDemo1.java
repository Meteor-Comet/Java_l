package 数据结构.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>((o1,o2)->o2 - o1);
        tm.put(4,"D");
        tm.put(2,"B");
        tm.put(3,"C");
        tm.put(1,"A");
        Set< Map.Entry<Integer,String>> entrySet = tm.entrySet();
        for(Map.Entry<Integer,String> entry : entrySet){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
