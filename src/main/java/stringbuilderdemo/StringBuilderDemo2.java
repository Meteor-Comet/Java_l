package stringbuilderdemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]);
        for(int i=1;i<arr.length;i++){
            sb.append(",").append(arr[i]);
        }
        sb.insert(0, "[");
        sb.append("]");
        System.out.println(sb);
    }
}
