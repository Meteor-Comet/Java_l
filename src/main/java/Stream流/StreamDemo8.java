package Stream流;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰-男-21", "张无忌-男-18", "周芷若-女-19", "赵敏-女-20", "小昭-女-16");
        List<String> newList = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toList());
        newList.forEach(System.out::println);
        System.out.println("----------------------");
        Set<String> newSet = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toSet());
        newSet.forEach(System.out::println);
        System.out.println("----------------------");
        Map<String, String> newMap = list.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> s.split("-")[2]));
        newMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}

