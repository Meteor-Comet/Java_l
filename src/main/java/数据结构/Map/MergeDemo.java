package 数据结构.Map;

import java.util.TreeMap;

public class MergeDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> counter = new TreeMap<>();
        
        // 模拟统计字符串中每个字符的出现次数
        String text = "hello";
        
        System.out.println("逐个处理字符:");
        for (char c : text.toCharArray()) {
            System.out.println("处理字符 '" + c + "'");
            
            // 使用merge方法进行计数
            counter.merge(c + "", 1, Integer::sum);
            
            System.out.println("当前统计结果: " + counter);
        }
        
        System.out.println("\n最终统计结果: " + counter);
        
        // 对比不使用merge的写法
        System.out.println("\n=== 不使用merge的等效写法 ===");
        TreeMap<String, Integer> counter2 = new TreeMap<>();
        for (char c : text.toCharArray()) {
            String key = c + "";
            if (counter2.containsKey(key)) {
                counter2.put(key, counter2.get(key) + 1);
            } else {
                counter2.put(key, 1);
            }
        }
        System.out.println("等效结果: " + counter2);
    }
}