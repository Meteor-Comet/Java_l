package Stream流;

import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("aaa",111);
        map.put("bbb",222);
        map.put("ccc",333);
        map.put("ddd",444);

        map.keySet().stream().forEach(System.out::println);
        System.out.println("=====================");
        map.values().stream().forEach(System.out::println);
        System.out.println("=====================");
        map.entrySet().stream().forEach(System.out::println);
    }
}
