package com.questions.questions2;

public class RoleTest {
    public static void main(String[] args) {
        Role role1 = new Role("张三丰", 100);
        Role role2 = new Role("郭襄", 100);
        int i = 1;
        while(true){
            System.out.println("第"+ i + "轮");
            role1.attack(role2);
            role2.attack(role1);
            System.out.println("===============");
            if(role1.getHp() == 0 || role2.getHp() == 0){
                break;
            }
            i++;
        }
    }
}
