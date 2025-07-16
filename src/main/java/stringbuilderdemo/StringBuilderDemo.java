package stringbuilderdemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder demo = new StringBuilder("abcdefg");
        System.out.println(demo.reverse());
        demo.append("hijklmn");
        System.out.println(demo.reverse());
        System.out.println(demo.length());
        String s = demo.toString();
        System.out.println(s);
    }
}
