package com.集合;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        System.out.print("[");
        for (String s : list){
            if(list.indexOf(s)==list.size()-1 || list.size()==1){
                System.out.print(s);
            }
            else{
                System.out.print(s + ",");
            }
        }
        System.out.println("]");
    }
}
