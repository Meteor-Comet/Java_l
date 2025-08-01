package com.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append("hello");
        sb1.append("hello");
        System.out.println(sb == sb1);
    }
}
