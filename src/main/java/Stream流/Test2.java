package Stream流;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        Collections.addAll(str,"zhangsan,23","lisi,24", "wangwu,25", "zhaoliu,26");
        Map<String, String> map = str.stream()
                //过滤年龄大于等于24
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
