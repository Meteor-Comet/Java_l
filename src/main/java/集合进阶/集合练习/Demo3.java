package 集合进阶.集合练习;

import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        // 原始名单
        ArrayList<String> originalBoy = new ArrayList<>();
        Collections.addAll(originalBoy, "男甲", "男乙", "男丙", "男丁", "男戊");
        ArrayList<String> originalGirl = new ArrayList<>();
        Collections.addAll(originalGirl, "女甲", "女乙", "女丙", "女丁", "女戊");
        
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int round = 1;
        
        // 循环进行多轮点名
        while (true) {
            System.out.println("第" + round + "轮点名开始！");
            
            // 每轮开始时重新填充名单
            ArrayList<String> boy = new ArrayList<>(originalBoy);
            ArrayList<String> girl = new ArrayList<>(originalGirl);
            
            // 本轮点名
            int totalPeople = boy.size() + girl.size();
            for (int i = 0; i < totalPeople; i++) {
                String name;
                // 70%概率点到男生，30%概率点到女生
                if (!boy.isEmpty() && (girl.isEmpty() || rand.nextInt(10) < 7)) {
                    // 从男生中随机选择一个
                    name = boy.remove(rand.nextInt(boy.size()));
                } else if (!girl.isEmpty()) {
                    // 从女生中随机选择一个
                    name = girl.remove(rand.nextInt(girl.size()));
                } else {
                    // 防止极端情况
                    name = boy.remove(rand.nextInt(boy.size()));
                }
                
                System.out.println("点到：" + name);
                System.out.println("按回车键继续...");
                scanner.nextLine(); // 等待用户按键
            }
            
            System.out.println("第" + round + "轮点名结束！");
            System.out.println("是否开始下一轮？(y/n)");
            String choice = scanner.nextLine();
            
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
            
            round++;
        }
        
        System.out.println("点名结束！");
        scanner.close();
    }
}