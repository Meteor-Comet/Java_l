package 字符串;

public class StringDemo7 {
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }

    public static String reverse(String str) {
        StringBuilder s = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            s.append(str.charAt(i));
        }
        return s.toString();
    }
}
