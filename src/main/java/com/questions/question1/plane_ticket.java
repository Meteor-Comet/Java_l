package com.questions.question1;
import java.util.Scanner;

public class plane_ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入舱位(0为经济舱，1为头等舱):");
        int class_ = sc.nextInt();
        switch(month) {
            case 5,6,7,8,9,10:
                price = getPrice(price,class_,0.95,0.8);
                break;
            case 11,12,1,2,3,4:
                price = getPrice(price,class_,0.85,0.7);
                break;
            default:
                System.out.println("输入错误！");
                return;
        }
        System.out.println("机票价格："+price);
        }

        static double getPrice(double price,int class_,double v0,double v1) {
            if (class_==0) {
                price *= v0;
            }
            else  {price *=v1;}
            return price;
        }
}
