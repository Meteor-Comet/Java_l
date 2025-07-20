package com.questions.question1;

public class prime_num {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 101; i < 201; i++){
            for(int j = 2; j < Math.sqrt(i); j++){
                if(i % j == 0){
                    break;
                }
                else if(j == (int)Math.sqrt(i)){
                    System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println("101-200的素数有"+count+"个");
    }
}
