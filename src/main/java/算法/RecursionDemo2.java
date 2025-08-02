package 算法;

import java.util.Scanner;

public class RecursionDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = sc.nextInt();
        System.out.println(multiply(n));
    }
    public static int multiply(int n) {
        if (n == 1) {
            return 1;
        }
        return n * multiply(n - 1);
    }
}
