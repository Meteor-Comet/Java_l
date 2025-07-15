package questions2;

public class RoleTest {
    public static void main(String[] args) {
        Role role1 = new Role("张三丰", 100);
        Role role2 = new Role("郭襄", 100);
        role1.attack(role2);
        role2.attack(role1);
    }
}
