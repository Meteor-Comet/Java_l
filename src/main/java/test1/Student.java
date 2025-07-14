package test1;

public class Student {
    private String name;
    private int age;

    //如果我们不写无参构造方法，那么编译器会默认添加一个无参构造方法
    public Student()
    {
        System.out.println("无参构造方法");
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("姓名：" + name + "，年龄：" + age);
    }
}
