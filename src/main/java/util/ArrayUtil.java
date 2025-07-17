package util;

public class ArrayUtil {
    private ArrayUtil(){}

    //返回整数数组的内容字符串
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAerage(double[] arr){
        double sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
