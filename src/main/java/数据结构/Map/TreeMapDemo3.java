package 数据结构.Map;

import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        String str = "aababcabcdabcade";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //treeMap.merge(c + "", 1, Integer::sum);
            Integer count = treeMap.get(c);
            if (count == null) {
                treeMap.put(c,1);
            } else {
                treeMap.put(c,count+1);
            }
        }
//        Set<Map.Entry<Character, Integer>> entrySet = treeMap.entrySet();
//        for (Map.Entry<Character, Integer> entry : entrySet) {
//            System.out.print(entry.getKey() + "(" + entry.getValue()+")");
//        }

//        StringBuilder sb = new StringBuilder();
//        treeMap.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));
//        System.out.println(sb);

        StringJoiner sj = new StringJoiner("", "", "");
        treeMap.forEach((key, value) -> sj.add(key + "(" + value + ")"));
        System.out.println(sj);
    }
}
