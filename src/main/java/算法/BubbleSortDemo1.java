package 算法;

public class BubbleSortDemo1 {
    public static void main(String[] args) {
        int[] arr = {16,5,9,12,21,18,37,35,42,47,50,22,67,12,90};
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
