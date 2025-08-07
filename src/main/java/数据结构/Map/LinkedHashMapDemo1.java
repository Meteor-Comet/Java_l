package 数据结构.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("A",1);
        lhm.put("A",1);
        lhm.put("B",2);
        lhm.put("C",3);

        Set<Map.Entry<String,Integer>> entrySet = lhm.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
