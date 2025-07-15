package questions2;

import java.util.Scanner;

public class Car {
    private String brand;
    private int price;
    private String color;

    public Car() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入汽车品牌：");
        this.brand = sc.next();
        System.out.print("请输入汽车价格：");
        this.price = sc.nextInt();
        System.out.print("请输入汽车颜色：");
        this.color = sc.next();
    }

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }
}
