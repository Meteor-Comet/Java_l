package zifuchuan;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        str = str.toUpperCase();
        String str2 = "ABC";
        System.out.println(str==str2);
    }
}
