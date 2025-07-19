package 多态练习;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼侧着头吃"+something);
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
