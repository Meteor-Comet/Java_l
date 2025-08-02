package 算法;

import java.util.Arrays;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18, 37, 35, 42, 47, 50, 22, 67, 12, 90};
        System.out.println("排序前: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后: " + Arrays.toString(arr));
    }

    /**
     * 快速排序算法实现
     * 基本思想：选择一个基准元素，通过一趟排序将待排序序列分割成独立的两部分，
     * 其中一部分记录的关键字均比另一部分记录的关键字小，
     * 再分别对这两部分记录继续进行排序，以达到整个序列有序。
     * 时间复杂度：
     * - 最好情况：O(n log n)
     * - 平均情况：O(n log n)
     * - 最坏情况：O(n²)
     * 空间复杂度：O(log n)
     * 稳定性：不稳定
     *
     * @param arr   待排序的整数数组
     * @param left  排序区间的左边界
     * @param right 排序区间的右边界
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            // 获取分区后基准元素的位置
            int pivotIndex = partition(arr, left, right);
            
            // 递归排序基准元素左边的子数组
            quickSort(arr, left, pivotIndex - 1);
            
            // 递归排序基准元素右边的子数组
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    /**
     * 分区操作：选择最后一个元素作为基准，将数组分为两部分
     * 左部分所有元素小于等于基准元素，右部分所有元素大于基准元素
     *
     * @param arr   待分区的数组
     * @param left  分区区间的左边界
     * @param right 分区区间的右边界
     * @return 基准元素的最终位置
     */
    private static int partition(int[] arr, int left, int right) {
        // 选择最右边的元素作为基准
        int pivot = arr[right];
        
        // i 表示小于基准元素区域的边界
        int i = left - 1;
        
        // 遍历数组，将小于基准的元素移到左边
        for (int j = left; j < right; j++) {
            // 如果当前元素小于等于基准元素
            if (arr[j] <= pivot) {
                i++;
                // 交换元素
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // 将基准元素放到正确位置
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        
        // 返回基准元素的位置
        return i + 1;
    }
}