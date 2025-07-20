package com.questions.question1;

import java.util.Random;

public class Red_Wars {
    public static void main(String[] args) {
        int [] arr = {2,588,888,1000,10000};
        Random r = new Random();
        int index = arr.length-1;
        for(int i=0;i<arr.length;i++){
            int index_r = r.nextInt(index+1);
            int red = arr[index_r];
            arr[index_r] = arr[index];
            index--;
            System.out.println("抽到的红包是"+red);
        }
    }
}
