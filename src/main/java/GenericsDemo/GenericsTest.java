package GenericsDemo;

public class GenericsTest {
    public static void main(String[] args) {
        GenericsDemo1<String> g1 = new GenericsDemo1<>();
        g1.add("aaa");
        g1.add("bbb");
        g1.add("ccc");
        System.out.println(g1);
    }
}
