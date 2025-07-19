package 多态练习;

public class Test {
    public static void main(String[] args) {
        Animal d = new Dog(2, "黑");
        Animal c = new Cat(3,"灰");
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);
        p1.keepPet(d,"骨头");
        p2.keepPet(c,"鱼");
    }
}
