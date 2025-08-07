package 数据结构.Map;

import java.util.HashMap;
import java.util.Random;
import java.util.Map;

public class HashMapDemo2 {
    private static final int ITERATIONS = 80;
    
    public static void main(String[] args) {
        HashMap<String, Integer> counterMap = getStringIntegerHashMap();

        System.out.println(counterMap);
        
        // 查找最大值及对应的键
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : counterMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("最大值是 " + maxKey + ": " + maxValue);
    }

    private static HashMap<String, Integer> getStringIntegerHashMap() {
        HashMap<String, Integer> counterMap = new HashMap<>();
        String[] options = {"A", "B", "C", "D"};

        // 初始化计数器
        for (String option : options) {
            counterMap.put(option, 0);
        }

        Random random = new Random();
        for (int i = 0; i < ITERATIONS; i++) {
            int randomIndex = random.nextInt(options.length);
            String selectedOption = options[randomIndex];
            counterMap.put(selectedOption, counterMap.get(selectedOption) + 1);
        }
        return counterMap;
    }
}