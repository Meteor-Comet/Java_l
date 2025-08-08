package Stream流;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr1 = { 1, 2, 3, 4, 5};
        String[] arr2 ={"张三","李四","王五"};
        // 获取Stream流
        Stream<Integer> stream = Arrays.stream(arr1).boxed();
        Arrays.stream(arr1).forEach(System.out::println);
        Arrays.stream(arr2).forEach(System.out::println);
    }
}
