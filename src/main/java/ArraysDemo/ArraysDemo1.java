package ArraysDemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo1 {
    public static void main(String[] args) {
        System.out.println("----------toString-----------");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        System.out.println("----------binarySearch-----------");
        int index = Arrays.binarySearch(arr, 3);
        System.out.println(index);
        System.out.println("----------copyOf-----------");
        int[] arr2 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr2));
        System.out.println("----------copyOfRange-----------");
        int[] arr3 = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arr3));
        System.out.println("----------fill-----------");
        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------sort-----------");
        int[] arr4 = {5, 3, 4, 1, 2};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
        Integer[] arr5 = {5, 3, 4, 1, 2};
        Arrays.sort(arr5,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr5));
    }
}
