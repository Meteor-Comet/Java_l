package 多态;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王键");
        t.setAge(30);

        Administrator a = new Administrator();
        a.setName("admin");
        a.setAge(25);

        register(s);
        register(t);
        register(a);

    }

    public static void register(Person p)
    {
        p.show();
        System.out.println("注册成功！");
        System.out.println("姓名：" + p.getName());
        System.out.println("年龄：" + p.getAge());
    }
}

