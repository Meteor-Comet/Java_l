package com.questions.question1;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        int[] scores = getScore();
        double max = getMax(scores);
        double min = getMin(scores);
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = (sum-max-min)/4 ;
        System.out.println("平均分是："+avg);
    }
    public static int[] getScore() {
        int[] scores= new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("请输入第"+(i+1)+"个评委的分数(0-100)：");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("输入错误！请重新输入！");
                i--;
                continue;
            }
            scores[i] = score;
        }
        return scores;
    }
    public static double getMax(int[] scores) {
        double max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
    public static double getMin(int[] scores) {
        double min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }
}
