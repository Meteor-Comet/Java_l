package 字符串练习;

public class Rotate2 {
    public static void main(String[] args) {
        String A="abcde";
        String B="cdeab";
        isRotate(A,B);
    }

    public static String rotate(String str){
        char[] arr = str.toCharArray();
        char first = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
        return new String(arr);
    }

    public static boolean isRotate(String str1, String str2){
        String rotate = str1;
        for(int i = 0; i < str1.length(); i++) {
            rotate = rotate(rotate);
            System.out.println(rotate);
            if (rotate.equals(str2)){
                System.out.println("符合条件");
                return  true;
            }
        }
        System.out.println("不符合条件");
        return false;
    }
}
