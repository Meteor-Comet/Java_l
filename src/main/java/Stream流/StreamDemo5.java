package Stream流;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5).filter(x -> x % 2 == 0).forEach(System.out::println);
        Stream.of("张三","李四","王五","张三丰").filter(x -> x.length() == 3).forEach(System.out::println);

    }
}
