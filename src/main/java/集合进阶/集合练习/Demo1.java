package 集合进阶.集合练习;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "南京市","扬州市","苏州市","无锡市","常州市");
        map.put("江苏省",list1);
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "武汉市","孝感市","十堰市","宜昌市","鄂州市");
        map.put("湖北省",list2);
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "石家庄市","唐山市","秦皇岛市","邯郸市","邢台市");
        map.put("河北省",list3);

        Set<Map.Entry<String, ArrayList<String>>> entrySet = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entrySet) {
            String str = String.join(",", entry.getValue());
            System.out.println(entry.getKey()+"="+str);
        }

    }
}
