package 数据结构.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Archer", "卫宫士郎");
        map.put("Saber", "阿尔托莉雅·潘德拉贡");
        map.put("Lancer", "库·丘林");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("=====================");
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });
        System.out.println("=====================");
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
