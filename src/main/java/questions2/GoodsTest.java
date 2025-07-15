package questions2;

public class GoodsTest {
    public static void main(String[] args) {
     Goods[] arr = new Goods[3];
     Goods g1 = new Goods("001","华为手机",5999,100);
     Goods g2 = new Goods("002","苹果手机",9999,100);
     Goods g3 = new Goods("003","小米手机",2999,100);
     arr[0] = g1;
     arr[1] = g2;
     arr[2] = g3;
     for(Goods i:arr){
         System.out.println(i);
     }
    }
}
