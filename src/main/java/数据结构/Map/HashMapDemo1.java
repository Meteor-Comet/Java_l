package 数据结构.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 19);
        Student s3 = new Student("王五", 20);
        Student s4 = new Student("王五", 20);
        map.put(s1, "北京");
        map.put(s2, "上海");
        map.put(s3, "广州");
        map.put(s4, "深圳");
        Set<Student> keys = map.keySet();
        for (Student k : keys) {
            System.out.println(k.getName() + " " + k.getAge()+ " " + map.get(k));
        }
        System.out.println("=====================");
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        for (Map.Entry<Student, String> entry : entrySet) {
            System.out.println(entry.getKey().getName() + " " + entry.getKey().getAge() + " " + entry.getValue());
        }
        System.out.println("=====================");
        keys.forEach(k -> System.out.println(k.getName() + " " + k.getAge()+ " "+ map.get(k)));
    }
}
