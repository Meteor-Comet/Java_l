package com.字符串;

public class StringDemo10 {
    public static void main(String[] args) {
        String IDcard = "211282200005286039";
        String birthday = IDcard.substring(6, 10) + "年" + IDcard.substring(10, 12) + "月" + IDcard.substring(12, 14) + "日";
        String gender = (IDcard.charAt(16)-48) % 2 == 1 ? "男" : "女";
        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + birthday);
        System.out.println("性别：" + gender);
    }
}
