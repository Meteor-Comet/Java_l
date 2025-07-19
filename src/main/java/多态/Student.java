package 多态;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    @Override
    public void show()
    {
        System.out.println("Student{name = " + getName() + ", age = " + getAge() + "}");
    }
}
