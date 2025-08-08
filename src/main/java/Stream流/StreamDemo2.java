package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","张三丰","张无忌","周芷若","赵敏");
//        Stream<String> stream1 = list.stream();
//        stream1.forEach(System.out::println);
        list.stream().forEach(System.out::println);
    }
}
