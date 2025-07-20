package com.questions.question1;

import java.util.Random;
import java.util.Scanner;

public class t_ball {
    public static void main(String[] args){
        int[] RewardArr = reward();
        int[] InputArr = meBall();
        int red = 0;
        int blue = 0;
        for(int i = 0; i < 6; i++){
            if (contain(RewardArr, InputArr[i])) red++;
        }
        if (RewardArr[6] == InputArr[6]) blue++;
        System.out.println("你输入的号码是:");
        print(InputArr);
        System.out.println("=======================");
        System.out.println("中奖号码是:");
        print(RewardArr);
        if(red == 6 && blue == 1) {System.out.println("恭喜你中奖了,一等奖奖金1000万元");}
        else if(red == 6 && blue == 0) {System.out.println("恭喜你中奖了,二等奖奖金500万元");}
        else if(red == 5 && blue == 1) {System.out.println("恭喜你中奖了,三等奖奖金3000元");}
        else if((red == 5 && blue == 0) | (red == 4 && blue == 1) ) {
            System.out.println("恭喜你中奖了,四等奖奖金200元");
        }
        else if((red == 4 && blue == 0) | (red == 3 && blue == 1) ) {
            System.out.println("恭喜你中奖了,五等奖奖金10元");
        }
        else if((red == 2 && blue == 1) | (red == 1 && blue == 1) | (red == 0 && blue == 1))
        {
            System.out.println("恭喜你中奖了,奖金50元");
        }
        else {
            System.out.println("没有中奖");
        }
    }
    public static int[] reward(){
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < 6; ) {
            int num = random.nextInt(33) + 1;
            if (!contain(arr, num)) {
                arr[i] = num;
                i++;
            }
        }
        arr[6] = random.nextInt(16) + 1;
        return arr;
    }
    public static int[] meBall(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6;) {
            System.out.print("请输入第"+(i+1)+"个红球号码(1-33的六个号码)：");
            int num = sc.nextInt();
            if (num < 1 || num > 33) {
                System.out.println("输入范围错误！请重新输入！");
                continue;
            }
            if (!contain(arr, num)) {
                arr[i] = num;
                i++;
            } else {
                System.out.println("输入重复！请重新输入！");
            }
        }
        boolean flag = true;
        while (flag) {
            System.out.print("请输入蓝球号码(1-16)：");
            int num = sc.nextInt();
            if (num < 1 || num > 16) {
                System.out.println("输入范围错误！");
            } else {
                arr[6] = num;
                flag = false;
            }
        }
        return arr;
    }

    public static boolean contain(int[] arr, int num){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == num) return true;
        }
        return false;
    }

    public static void judgeball(int red, int blue){

    }
    public static void print(int[] arr){
        for (int i:arr) System.out.print(i+" ");
        System.out.println();
    }
}
