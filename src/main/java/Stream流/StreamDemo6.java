package Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰-16","张无忌-18","周芷若-20","赵敏-19");
//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] split = s.split("-");
//                String ageStr = split[1];
//                return Integer.parseInt(ageStr);
//            }
//        }).forEach(System.out::println);
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(System.out::println);
    }
}
