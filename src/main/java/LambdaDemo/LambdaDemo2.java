package LambdaDemo;

import java.util.*;
import java.util.function.*;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 1. 基本Lambda表达式语法
        System.out.println("=== 基本Lambda表达式 ===");
        
        // 无参数无返回值
        Runnable r1 = () -> System.out.println("Hello Lambda!");
        r1.run();
        
        // 有参数有返回值
        Comparator<Integer> c1 = (a, b) -> a - b;
        System.out.println("比较结果: " + c1.compare(5, 3));
        
        // 2. 集合操作中的Lambda表达式
        System.out.println("\n=== 集合操作 ===");
        List<String> list = Arrays.asList("apple", "banana", "orange", "grape", "watermelon");
        
        // forEach遍历
        System.out.println("遍历集合:");
        list.forEach(s -> System.out.println(s));
        
        // filter过滤
        System.out.println("\n长度大于5的水果:");
        list.stream()
            .filter(s -> s.length() > 5)
            .forEach(System.out::println);
        
        // map转换
        System.out.println("\n转换为大写:");
        list.stream()
            .map(s -> s.toUpperCase())
            .forEach(System.out::println);
        
        // sorted排序
        System.out.println("\n按长度排序:");
        list.stream()
            .sorted((s1, s2) -> s1.length() - s2.length())
            .forEach(System.out::println);
        
        // 3. 函数式接口
        System.out.println("\n=== 函数式接口 ===");
        
        // Function接口 - 转换操作
        Function<String, Integer> strLen = s -> s.length();
        System.out.println("字符串长度: " + strLen.apply("Lambda"));
        
        // Predicate接口 - 判断操作
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("8是偶数吗? " + isEven.test(8));
        
        // Consumer接口 - 消费操作
        Consumer<String> printer = s -> System.out.println("消费: " + s);
        printer.accept("Hello Consumer");
        
        // Supplier接口 - 生产操作
        Supplier<Double> random = () -> Math.random();
        System.out.println("随机数: " + random.get());
        
        // 4. 方法引用
        System.out.println("\n=== 方法引用 ===");
        
        // 静态方法引用
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6);
        System.out.println("排序前: " + numbers);
        numbers.sort(Integer::compareTo);
        System.out.println("排序后: " + numbers);
        
        // 实例方法引用
        List<String> words = Arrays.asList("hello", "world", "java", "lambda");
        words.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
        
        // 构造方法引用
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> newList = listSupplier.get();
        newList.add("通过构造方法引用创建的列表");
        System.out.println("新列表内容: " + newList);
        
        // 5. 变量作用域
        System.out.println("\n=== 变量作用域 ===");
        String prefix = "前缀:";
        Consumer<String> prefixedPrinter = s -> System.out.println(prefix + s);
        prefixedPrinter.accept("变量作用域示例");
        
        // 6. 复合操作
        System.out.println("\n=== 复合操作 ===");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // 计算偶数的平方和
        int sum = nums.stream()
                      .filter(n -> n % 2 == 0)      // 筛选偶数
                      .map(n -> n * n)              // 平方
                      .reduce(0, Integer::sum);     // 求和
        System.out.println("偶数的平方和: " + sum);
    }
}