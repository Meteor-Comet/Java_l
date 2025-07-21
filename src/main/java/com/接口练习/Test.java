package com.接口练习;

public class Test {
    public static void main(String[] args) {
        PingPangSporter ps = new PingPangSporter("小王", 18);
        ps.learn();
        ps.speak();
        PingPangCoach pc = new PingPangCoach("李教练", 39);
        pc.teach();
        pc.speak();
        BasketballSporter bs = new BasketballSporter("小张", 19);
        bs.learn();
        BasketballCoach bc = new BasketballCoach("王教练", 39);
        bc.teach();
    }
}
