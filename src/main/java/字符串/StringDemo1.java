package 字符串;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "hello world";
        System.out.println(s1);

        String s2 = new String();
        System.out.println("1"+s2+"1");

        String s3 = new String("hello world");
        System.out.println(s3);

        char[] chs = {'h', 'e', 'l', 'l', 'o'};
        String s4 = new String(chs);
        System.out.println(s4);

        byte[] bytes = {97, 98, 99, 100};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
