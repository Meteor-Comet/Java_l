package GenericsDemo;

import java.util.ArrayList;

public class HuskyDog extends Dog{
    public HuskyDog(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只叫"+getName()+"的"+getAge()+"岁的哈士奇正在吃骨头，边吃边拆家");
    }
}
