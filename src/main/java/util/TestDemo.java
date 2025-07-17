package util;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        double[] arr_1 = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.10};
        System.out.println(ArrayUtil.printArr(arr));
        System.out.println(ArrayUtil.getAerage(arr_1));
    }
}
