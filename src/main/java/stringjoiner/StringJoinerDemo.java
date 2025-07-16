package stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        StringJoiner sj = new StringJoiner(",","[","]");
        for(int i:arr){
            sj.add(i+"");
        }
        String str = sj.toString();
        System.out.println(str);
    }
}
