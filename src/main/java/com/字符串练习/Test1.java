package com.字符串练习;

public class Test1 {
    public static void main(String[] args) {
        String a = "the moon   ";
        System.out.println(count(a));
    }

    public static int count(String a) {
        int count = 0;
        StringBuilder sb = new StringBuilder(a);
        int sum = sb.length();
        for (int i = sum-1; i >= 0; i--) {
            if(sb.charAt(sb.length()-1) == ' '){
                sb.delete(sb.length() - 1, sb.length());
            }
        }
        for (int i=sb.length()-1;i>=0;i--){
            if(sb.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
