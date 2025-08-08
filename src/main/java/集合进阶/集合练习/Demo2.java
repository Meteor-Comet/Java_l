package 集合进阶.集合练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo2 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "赵六", "孙七");
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));
    }
}
