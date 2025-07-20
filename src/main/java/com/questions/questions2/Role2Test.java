package com.questions.questions2;

public class Role2Test {
    public static void main(String[] args) {
        Role2 role1 = new Role2("欧阳锋", 100, "男");
        Role2 role2 = new Role2("郭襄", 100, "女");
        role1.show();
        role2.show();
        int i = 1;
        while(true){
            System.out.println("第"+ i + "轮");
            role1.attack(role2);
            if(role2.getHp() == 0){
                break;
            }
            role2.attack(role1);
            if(role1.getHp() == 0){
                break;
            }
            System.out.println("===============");
            i++;
        }
    }
}
