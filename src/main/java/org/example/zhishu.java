package org.example;

import java.util.Scanner;

public class zhishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int a = sc.nextInt();
        //解释为什么循环条件是Math.sqrt(a)
        //因为如果a是素数，那么a的平方根的整数部分小于a
        //所以i<Math.sqrt(a)
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                System.out.println("不是素数");
                return;
            }
        }
        System.out.println("是素数");
    }
}
