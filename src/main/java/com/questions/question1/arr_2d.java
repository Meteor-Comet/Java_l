package com.questions.question1;

public class arr_2d {
    public static void main(String[] args) {
     int[] arr1 = {22,66,44};
     int[] arr2 = {33,55,77};
     int[] arr3 = {23,65,47};
     int[] arr4 = {45,46,49};
     int[][] arr = {arr1,arr2,arr3,arr4};
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
