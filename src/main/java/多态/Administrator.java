package 多态;

public class Administrator extends Person{
    public Administrator() {
    }

    public Administrator(String name, int age) {
        super(name, age);
    }


    @Override
    public void show() {
        System.out.println("Administrator{name = " + getName() + ", age = " + getAge() + "}");
    }

}
