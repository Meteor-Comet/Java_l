package zifuchuan;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "hello world";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("hello world");
        String s4 = new String("Hello World");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
