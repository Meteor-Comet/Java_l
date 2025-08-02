package 算法;

import java.util.Arrays;

public class InsertSortDemo1 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18, 37, 35, 42, 47, 50, 22, 67, 12, 90};
        System.out.println("排序前: " + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }

    /**
     * 插入排序算法实现
     * 基本思想：将数组分为已排序和未排序两部分，依次将未排序部分的元素插入到已排序部分的合适位置
     * 时间复杂度：O(n²)
     * 空间复杂度：O(1)
     * 稳定性：稳定
     *
     * @param arr 待排序的整数数组
     */
    public static void insertSort(int[] arr) {
        int n = arr.length;

        // 从第二个元素开始，逐个将未排序元素插入到已排序部分
        for (int i = 1; i < n; i++) {
            // 当前要插入的元素
            int key = arr[i];
            
            // 在已排序部分中找到合适的插入位置
            // 从已排序部分的最后一个元素开始向前比较
            int j = i - 1;
            
            // 将大于key的元素向后移动一位
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            // 将key插入到正确位置
            arr[j + 1] = key;
            
            // 输出每轮排序后的结果（可选，用于观察排序过程）
            System.out.println("第" + i + "轮排序后: " + Arrays.toString(arr));
        }
    }
}