package staticdemo;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "王老师";
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);
        student1.setGender("男");
        student1.study();
        System.out.println(student1);
        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(19);
        student2.setGender("女");
        student2.study();
        System.out.println(student2 );

    }
}
