package 字符串;

public class StringDemo6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        String s = "[";
        s += arr[0];
        for(int i = 1;i < arr.length;i++){
            s += "," + arr[i];
        }
        s += "]";
        System.out.println(s);
        System.out.println(s.length());
    }
}
