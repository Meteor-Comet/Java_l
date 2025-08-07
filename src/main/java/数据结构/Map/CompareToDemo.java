package 数据结构.Map;

import java.util.Date;
import java.io.File;

public class CompareToDemo {
    public static void main(String[] args) {
        // String类型的compareTo
        String str1 = "apple";
        String str2 = "banana";
        System.out.println("字符串比较: \"" + str1 + "\".compareTo(\"" + str2 + "\") = " + str1.compareTo(str2));
        
        // 数值类型的compareTo
        Integer num1 = 10;
        Integer num2 = 20;
        System.out.println("整数比较: " + num1 + ".compareTo(" + num2 + ") = " + num1.compareTo(num2));
        
        // Double类型的compareTo
        Double d1 = 3.14;
        Double d2 = 2.71;
        System.out.println("小数比较: " + d1 + ".compareTo(" + d2 + ") = " + d1.compareTo(d2));
        
        // Character类型的compareTo
        Character c1 = 'A';
        Character c2 = 'B';
        System.out.println("字符比较: '" + c1 + "'.compareTo('" + c2 + "') = " + c1.compareTo(c2));
        
        // Date类型的compareTo
        Date date1 = new Date(2022, 1, 1);
        Date date2 = new Date(2023, 1, 1);
        System.out.println("日期比较: " + date1.compareTo(date2));
        
        // Boolean类型的compareTo (需要使用Boolean.TRUE/FALSE或boolean转Boolean)
        Boolean bool1 = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        System.out.println("布尔比较: " + bool1 + ".compareTo(" + bool2 + ") = " + bool1.compareTo(bool2));
    }
}