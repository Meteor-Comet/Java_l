package 数据结构.Set;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.getAge() - o.getAge();
//    }
    @Override
    public int compareTo(Student other) {
        // 主要条件：按年龄排序
        int ageCompare = Integer.compare(this.age, other.age);
        System.out.println("this: " + this);
        System.out.println("other: " + other);
        System.out.println("============");
        if (ageCompare != 0) {
            return ageCompare;
        }

        // 次要条件：按id排序（确保年龄相同时也能区分不同对象）
        return Integer.compare(this.hashCode(), other.hashCode());
    }
}
