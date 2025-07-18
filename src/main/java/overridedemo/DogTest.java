package overridedemo;

public class DogTest {
    public static void main(String[] args) {
        Husky h = new Husky();
        h.breakHome();
        SharPei s = new SharPei();
        s.eat();
        ZhongHua z = new ZhongHua();
        z.eat();
    }
}
