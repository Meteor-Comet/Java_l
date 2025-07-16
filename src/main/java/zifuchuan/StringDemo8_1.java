package zifuchuan;

import java.util.Scanner;

public class StringDemo8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入发票金额：");
        String s = "佰拾万仟佰拾元";
        StringBuffer result = new StringBuffer(s);
        int money;
        while (true) {
            money = sc.nextInt();
            if (money < 0 || money > 9999999) {
                System.out.println("输入金额超出范围！请重新输入:");
                continue;
            }
            break;
        }
        String money_str = transfer(String.valueOf(money));
        System.out.println(money_str);
        int index = 0;
        for (int i = 0; i < money_str.length(); i++) {
            result.insert(index, money_str.charAt(i));
            index += 2;
        }
        System.out.println(result);
    }

    public static String transfer(String money) {
        String str1 = "零壹贰叁肆伍陆柒捌玖";
        String str2 = "0123456789";
        StringBuilder str3 = new StringBuilder();
        for(int i = 0;i < money.length();i++){
            int index = str2.indexOf(money.charAt(i)+"");
            str3.append(str1.charAt(index));
        }
        for (int i = 0; i < (7-money.length()); i++){
            str3.insert(0, "零");
        }
        return str3.toString();
    }

}
