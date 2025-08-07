package 数据结构.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class ComparatorDemo {
    public static void main(String[] args) {
        // 升序排列 - 正常顺序
        System.out.println("=== 升序排列 ===");
        TreeMap<Integer, String> ascendingMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("比较 " + o1 + " 和 " + o2 + "，返回值: " + (o1 - o2));
                return o1 - o2; // 升序
            }
        });
        
        ascendingMap.put(3, "C");
        ascendingMap.put(1, "A");
        ascendingMap.put(4, "D");
        ascendingMap.put(2, "B");
        System.out.println("升序结果: " + ascendingMap);
        
        // 降序排列 - 相反顺序
        System.out.println("\n=== 降序排列 ===");
        TreeMap<Integer, String> descendingMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("比较 " + o1 + " 和 " + o2 + "，返回值: " + (o2 - o1));
                return o2 - o1; // 降序
            }
        });
        
        descendingMap.put(3, "C");
        descendingMap.put(1, "A");
        descendingMap.put(4, "D");
        descendingMap.put(2, "B");
        System.out.println("降序结果: " + descendingMap);
    }
}