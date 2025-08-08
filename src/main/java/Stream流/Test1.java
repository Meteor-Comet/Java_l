package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums,1,2,3,4,5,6,7,8,9,10);
//        Integer[] array =  nums.stream()
//                .filter(x -> x % 2 == 0)
//                .toArray(new IntFunction<Integer[]>() {
//                    @Override
//                    public Integer[] apply(int value) {
//                        return new Integer[value];
//                    }
//                });
//        for (Integer array1 : array) {
//            System.out.println(array1);
//        }
        List<Integer> list = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
