package org.example;

import java.util.Scanner;

public class zhishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int a = sc.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("不是素数");
                return;
            }
        }
    }
}
