package questions;

import java.util.Scanner;

public class enctyption_arr {
    public static void main(String[] args){
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入四位数密码：");
        for(int i=0;i<arr.length;i++){
            System.out.print("请输入第"+(i+1)+"位密码：");
            arr[i] = sc.nextInt();
        }
        int pwd = encrypt(arr);
        System.out.println("加密后的密码为："+pwd);
        int[] pwd_arr = decode(pwd);
        System.out.print("解密后的密码为：");
        for (int i : pwd_arr) {
            System.out.print(i);
        }
    }

    public static int encrypt(int[] keys) {
        int pwd = 0;
        for(int i = keys.length-1;i>=0;i--){
            pwd = pwd*10+(keys[i]+5)%10;
        }
        return pwd;
    }

    public static int [] decode(int pwd) {
        int[] pwd2 = new int[4];
        int i = 0;
        while(pwd!=0){
            pwd2[i] = pwd%10-5;
            pwd = pwd/10;
            i++;
        }
        return pwd2;
    }
}
