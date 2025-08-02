package 算法;

import java.util.Arrays;

public class SelectionDemo {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18, 37, 35, 42, 47, 50, 22, 67, 12, 90};
        System.out.println("排序前: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }

    /**
     * 选择排序算法实现
     * 基本思想：每次从未排序的部分中找到最小元素，放到已排序部分的末尾
     * 时间复杂度：O(n²)
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     *
     * @param arr 待排序的整数数组
     */
    public static void selectionSort(int[] arr) {
        // 选择排序
        int n = arr.length;

        // 外层循环控制排序轮数，需要进行 n-1 轮
        for (int i = 0; i < n - 1; i++) {
            // 假设当前位置 i 就是最小值的位置
            int minIndex = i;

            // 内层循环在未排序部分 [i+1, n-1] 中寻找真正的最小值
            for (int j = i + 1; j < n; j++) {
                // 如果找到更小的元素，更新最小值索引
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 如果最小值不在当前位置 i，则交换元素
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            // 输出每轮排序后的结果（可选，用于观察排序过程）
            System.out.println("第" + (i + 1) + "轮排序后: " + Arrays.toString(arr));
        }
    }
}