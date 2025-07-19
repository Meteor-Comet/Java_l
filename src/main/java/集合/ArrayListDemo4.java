package 集合;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo4 {
    public static void main(String[] args)
    {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("1","张三","123456"));
        users.add(new User("2","李四","123456"));
        users.add(new User("3","王五","123456"));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户id：");
        String id = sc.next();
        query(id, users);
    }

    public static void query(String id, ArrayList<User> users){
        for(User user : users){
            if(user.getId().equals(id)){
                System.out.println(user);
                return;
            }
        }
        System.out.println("没有此用户");
    }
}
