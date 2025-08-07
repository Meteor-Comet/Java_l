package 数据结构.Map;

import java.util.*;

// 一个没有实现Comparable接口的简单类
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class CompareDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("张三", 25));
        people.add(new Person("李四", 20));
        people.add(new Person("王五", 30));
        
        // 使用Comparator的compare方法按年龄排序
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
        
        System.out.println("按年龄排序: " + people);
        
        // 使用Lambda表达式简化
        people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("按姓名排序: " + people);
        
        // 在TreeMap中使用Comparator
        TreeMap<Person, String> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                // 先按年龄排序，再按姓名排序
                int ageCompare = Integer.compare(p1.getAge(), p2.getAge());
                return ageCompare != 0 ? ageCompare : p1.getName().compareTo(p2.getName());
            }
        });
        
        map.put(new Person("张三", 25), "北京");
        map.put(new Person("李四", 20), "上海");
        map.put(new Person("王五", 25), "广州");
        System.out.println("TreeMap排序结果: " + map);
    }
}