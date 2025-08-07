package 数据结构.Map;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>((o1, o2) -> {
            // 首先按年龄排序
            int ageCompare = Integer.compare(o1.getAge(), o2.getAge());
            // 如果年龄相同，按姓名排序
            return ageCompare != 0 ? ageCompare : o1.getName().compareTo(o2.getName());
        });
        treeMap.put(new Student("张三", 20), "郑州");
        treeMap.put(new Student("李四", 19), "广州");
        treeMap.put(new Student("王五", 19), "上海");
        treeMap.put(new Student("赵六", 21), "北京");
        System.out.println(treeMap);
    }
}
