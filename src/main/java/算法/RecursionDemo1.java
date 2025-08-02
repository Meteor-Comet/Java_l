package 算法;

import java.util.Scanner;

public class RecursionDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n) {
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
