package com.集合;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("华为", 5999));
        phones.add(new Phone("小米", 2999));
        phones.add(new Phone("苹果", 9999));
        ArrayList<Phone> phones2 = getPhones(phones);
        for (Phone phone : phones2){
            System.out.println(phone.getBrand() + ":" + phone);
        }
    }

    public static ArrayList<Phone> getPhones(ArrayList<Phone> phones) {
        ArrayList<Phone> phoneList = new ArrayList<>();
        for(Phone phone : phones){
            if(phone.getPrice() > 3000){
                phoneList.add(phone);
            }
        }
        return phoneList;
    }
}
