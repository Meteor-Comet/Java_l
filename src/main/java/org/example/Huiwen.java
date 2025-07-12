package org.example;
import java.util.Scanner;
//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int n = sc.nextInt();
        int n1 = n;
        int m=0;
        while(n1>0){
            m = m*10+n1%10;
            n1 = n1/10;
        }
        if (m==n){
            System.out.println("是回文数");
        }
        else{
            System.out.println("不是回文数");
        }
    }
}