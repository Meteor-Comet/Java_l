package Stream流;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");

        list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);

    }
}
