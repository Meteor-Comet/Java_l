package com.questions.questions2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("华为", 5999, "蓝色");
        phones[1] = new Phone("苹果", 9999, "黑色");
        phones[2] = new Phone("小米", 3999, "白色");
        int sum = 0;
        for (int i = 0; i < phones.length; i++) {
            sum += phones[i].getPrice();
        }
        int avg = sum / phones.length;
        System.out.println("平均价格是：" + avg);
    }
}
