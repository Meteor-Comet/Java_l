package LambdaDemo;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {6,4,2,10,8,3,32};
        Arrays.sort(arr,(a,b)->b-a);
        System.out.println(Arrays.toString(arr));
    }
}
