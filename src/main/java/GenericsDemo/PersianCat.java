package GenericsDemo;

public class PersianCat extends Cat{
    public PersianCat(String name, int age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println("一只叫"+getName()+"的"+getAge()+"岁的波斯猫正在吃饼干");
    }
}
