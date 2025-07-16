package stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        String str_v = new StringBuilder(str).reverse().toString();
        if(str.equals(str_v)){
            System.out.println("是对称字符串");
        }
        else{
            System.out.println("不是对称字符串");
        }
    }
}
