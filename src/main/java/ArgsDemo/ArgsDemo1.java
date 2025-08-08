package ArgsDemo;

public class ArgsDemo1 {
    public static void main(String[] args){
        System.out.println(sum(1,2,3,4,5));
    }
    public static int sum(int... args){
        int sum = 0;
        for(int i:args){
            sum += i;
        }
        return sum;
    }
}
