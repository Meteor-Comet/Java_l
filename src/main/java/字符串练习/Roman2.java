package 字符串练习;

import java.util.Scanner;

public class Roman2 {
    public static void main(String[] args) {
        System.out.println("请输入一个长度小于等于9的纯数字字符串：");
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.next();
            if (isValidKey(str)) {
                break;
            }
            else {
                System.out.println("输入有误,请重新输入：");
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int key = str.charAt(i) - '0';
            result.append(transfer(key));
        }
        System.out.println(result);
    }

    public static boolean isValidKey(String key) {
        if (key.length() > 9) {
            System.out.println("输入超出范围：");
            return false;
        }
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String transfer(int key) {
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[key];
    };

}

