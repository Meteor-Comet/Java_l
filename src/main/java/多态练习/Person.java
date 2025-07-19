package 多态练习;

public class Person {
    private String name;
    private int age;

    public void keepPet(Animal a, String something) {
        String animalName;
        if(a instanceof Dog d){
            animalName="狗";
            System.out.println(getAge()+"岁的"+getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的"+animalName);
            d.eat(something);
            d.lookHome();
        }
        else if(a instanceof Cat c){
            animalName="猫";
            System.out.println(getAge()+"岁的"+getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的"+animalName);
            c.eat(something);
            c.catchMouse();
        }
        else{
            System.out.println("没有这种动物");}

    }

    public Person() {
    }

    public Person(String name, int age) {
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

}
