package 数据结构.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",18);
        map.put("张三",19);
        map.put("张三",20);
        map.put("李四",21);
        map.put("王五",22);
        System.out.println(map.get("张三"));
        System.out.println(map.size());
        System.out.println(map);
        map.remove("张三");
        System.out.println(map);
        System.out.println(map.containsKey("张三"));
        System.out.println(map.containsValue(21));
        for (String key : map.keySet()){
            System.out.println(key+"--->"+map.get(key));
        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+"--->"+map.get(key));
        }
        map.keySet().forEach(key-> System.out.println(key+"--->"+map.get(key)));
    }
}
