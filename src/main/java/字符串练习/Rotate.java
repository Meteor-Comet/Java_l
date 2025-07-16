package 字符串练习;

public class Rotate {
    public static void main(String[] args) {
        String A="abcde";
        String B="cdeab";
        String rotate = A;
        for(int i = 0; i < A.length(); i++) {
            rotate = rotate(rotate);
            System.out.println(rotate);
            if (rotate.equals(B)){
                System.out.println("符合条件");
                return;
            }
        }
        System.out.println("不符合条件");
    }

    public static String rotate(String str){
        char first = str.charAt(0);
        String end = str.substring(1);
        return end+first;
    }
}
