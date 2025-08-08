package myFunction;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
//        Arrays.sort(arr,new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

//        Arrays.sort(arr, (o1, o2) -> o2 - o1);
//        System.out.println(Arrays.toString(arr));

        //方法引用
        Arrays.sort(arr, FunctionDemo1::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int a, int b) {
        return b - a;
    }
}
