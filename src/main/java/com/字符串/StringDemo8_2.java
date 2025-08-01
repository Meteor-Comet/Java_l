package com.字符串;

import java.util.Scanner;


public class StringDemo8_2 {
    public static void main(String[] args) {
        String[] arr={"佰","拾", "万", "仟", "佰", "拾" , "元"};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入发票金额：");
        int money;
        while (true) {
            money = sc.nextInt();
            if (money < 0 || money > 9999999) {
                System.out.println("输入金额超出范围！请重新输入:");
                continue;
            }
            break;
        }
        String s = "";
        while(money>0){
            s= transfer(money % 10)+s;
            money = money/10;
        }
        int count = 7-s.length();
        for (int i = 0; i < count; i++){
            s = "零" + s;
        }
        String result = "";
        for (int i = 0; i < s.length(); i++){
            result += s.charAt(i) + arr[i];
        }
        System.out.println(result);
    }

    public static String transfer(int money) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[money];
    }

}
