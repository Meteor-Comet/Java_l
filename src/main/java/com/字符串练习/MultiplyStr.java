package com.字符串练习;

public class MultiplyStr {
    public static void main(String[] args) {
        String a = "12333";
        String b = "45678";
        int a1 = trans(a);
        int b1 = trans(b);
        String res =String.valueOf(a1*b1);
        System.out.println(res);
    }

    public static int trans(String a){
        int[] arr = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            arr[i] = a.charAt(i)-48;
        }
        int res = 0;
        for (int j : arr) {
            res = res * 10 + j;
        }
        return res;
    }
}
