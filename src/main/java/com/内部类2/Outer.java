package com.内部类2;

public class Outer {
    int a = 10;
    static int b = 20;

    static class Inner{
        public void show1()
        {
            Outer o = new Outer();
            System.out.println("非静态方法被调用");
            System.out.println(o.a);
            System.out.println(b);

        }
        public static void show2()
        {
            Outer o = new Outer();
            System.out.println("静态方法被调用");
            System.out.println(o.a);
            System.out.println(b);
        }
    }
}
