package overridedemo;

public class SharPei extends Dog{
    @Override
    public void eat()
    {
        System.out.println("吃狗粮，吃骨头");
    }
}
