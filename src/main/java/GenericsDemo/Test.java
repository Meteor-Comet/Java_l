package GenericsDemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<PearCat> list1 = new ArrayList<>();
        list1.add(new PearCat("狸花甲", 3));
        list1.add(new PearCat("狸花乙", 4));
        keepCat(list1);
        ArrayList<PersianCat> list2 = new ArrayList<>();
        list2.add(new PersianCat("波斯猫甲", 5));
        list2.add(new PersianCat("波斯猫乙", 6));
        keepCat(list2);
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();
    }

    public static void keepCat(ArrayList<? extends Cat> list){
        for(Cat c:list){
            c.eat();
        }
    }
    public static void keepDog(ArrayList<? extends Dog> list){
        for(Dog d:list){
            d.eat();
        }
    }
}
