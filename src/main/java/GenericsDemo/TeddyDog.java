package GenericsDemo;

public class TeddyDog extends Dog{

    public TeddyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫"+getName()+"的"+getAge()+"岁的泰迪正在吃骨头");
    }
}
