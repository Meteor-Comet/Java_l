package questions;

import java.util.Scanner;

public class encryption {
    public static void main(String[] args) {
        int pwd;
        int pwd1=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入四位数密码:");
        pwd = sc.nextInt();
        while(pwd>0){
        pwd1 = pwd1*10+(pwd%10+5)%10;
        pwd/=10;
        }
        System.out.println("加密后的密码为:"+pwd1);
    }
}
