package LambdaDemo;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        String[] arr ={"aaaaa","aaa","aaaaaa","aaaa","a","aa"};
        Arrays.sort(arr,(a, b)->a.length()-b.length());
        System.out.println(Arrays.toString(arr));
    }
}
