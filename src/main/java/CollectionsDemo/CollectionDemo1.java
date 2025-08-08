package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        Collections.addAll(c, "ddd", "eee");
        System.out.println(c);
        Collections.shuffle(c);
    }
}
