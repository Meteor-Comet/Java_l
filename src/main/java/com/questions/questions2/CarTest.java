package com.questions.questions2;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for(int i=0; i<cars.length; i++){
            System.out.println("请输入第"+(i+1)+"辆车的参数");
            Car car = new Car();
            cars[i] = car;
        }
        for(Car car:cars){
            System.out.println(car);
        }
    }
}
