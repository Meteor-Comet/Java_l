package GenericsDemo;

public class PearCat extends Cat{
    public PearCat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只叫"+getName()+"的"+getAge()+"岁的狸花猫正在吃鱼");
    }
}
