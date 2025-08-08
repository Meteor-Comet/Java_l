package 集合进阶.集合练习;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        try {
            // 读取学生名单
            List<String> students = readStudentsFromFile("F:\\JavaProjects\\learn\\src\\main\\java\\集合进阶\\集合练习\\students.txt");
            
            // 初始化每个学生的权重（权重越高被点到的概率越大）
            Map<String, Double> weights = new HashMap<>();
            for (String student : students) {
                weights.put(student, 1.0);
            }
            
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            
            // 进行5次点名
            for (int round = 1; round <= 5; round++) {
                System.out.println("第" + round + "次点名：");
                
                String selectedStudent;
                // 第三次点名一定是张三（作弊要求）
                if (round == 3) {
                    selectedStudent = "张三";
                } else {
                    // 根据权重随机选择学生
                    selectedStudent = selectStudentByWeight(students, weights);
                }
                
                System.out.println("点到：" + selectedStudent);
                
                // 调整被点到学生的权重（降低一半）
                weights.put(selectedStudent, weights.get(selectedStudent) / 2);
                
                // 显示概率变化情况（以张三为例）
                if (selectedStudent.equals("张三")) {
                    double totalWeight = calculateTotalWeight(weights);
                    double zhangSanProbability = (weights.get("张三") / totalWeight) * 100;
                    System.out.println("张三下次被点到的概率：" + String.format("%.5f", zhangSanProbability) + "%");
                }
                
                System.out.println("按回车键继续...");
                scanner.nextLine();
            }
            
            scanner.close();
        } catch (IOException e) {
            System.err.println("读取学生名单文件时出错：" + e.getMessage());
        }
    }
    
    /**
     * 从文件中读取学生名单
     * @param filePath 文件路径
     * @return 学生名单列表
     * @throws IOException 文件读取异常
     */
    private static List<String> readStudentsFromFile(String filePath) throws IOException {
        List<String> students = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            students.add(line.trim());
        }
        reader.close();
        return students;
    }
    
    /**
     * 根据权重选择学生
     * @param students 学生列表
     * @param weights 权重映射
     * @return 被选中的学生姓名
     */
    private static String selectStudentByWeight(List<String> students, Map<String, Double> weights) {
        // 计算总权重
        double totalWeight = calculateTotalWeight(weights);
        
        // 生成一个0到总权重之间的随机数
        double randomValue = new Random().nextDouble() * totalWeight;
        
        // 根据权重选择学生
        double currentWeight = 0;
        for (String student : students) {
            currentWeight += weights.get(student);
            if (randomValue <= currentWeight) {
                return student;
            }
        }
        
        // 理论上不会执行到这里，但为了防止意外，返回第一个学生
        return students.get(0);
    }
    
    /**
     * 计算总权重
     * @param weights 权重映射
     * @return 总权重
     */
    private static double calculateTotalWeight(Map<String, Double> weights) {
        double totalWeight = 0;
        for (double weight : weights.values()) {
            totalWeight += weight;
        }
        return totalWeight;
    }
}