package 算法;

import static java.util.Arrays.binarySearch;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = binary_S(arr, 5);
        System.out.println(index);
    }
    public static int binary_S(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
