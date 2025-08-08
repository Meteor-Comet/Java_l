package Stream流;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> actors = new ArrayList<>();
        ArrayList<String> actress = new ArrayList<>();
        Collections.addAll(actors,"男演员甲,24","男演员乙,25","男演员丙,26","男员丁,27","男演员戊,36");
        Collections.addAll(actress,"女演员甲,24","女演员乙,24","女演员丙,26","女演员丁,23","女演员戊,33");
        Stream<String> stream1 = actors.stream()
                .filter(s -> s.split(",")[0].length() == 4)
                .limit(2);
        Stream<String> stream2 = actress.stream()
                .filter(s -> s.split(",")[0].contains("女") && s.split(",")[1].equals("24"))
                .skip(1);
//        Stream.concat(stream1,stream2)
//                .map(new Function<String, Actor>() {
//                    @Override
//                    public Actor apply(String s) {
//                        String[] split = s.split(",");
//                        int age = Integer.parseInt(split[1]);
//                        return new Actor(split[0],age);
//                    }
//        });
        List<Actor> list = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
