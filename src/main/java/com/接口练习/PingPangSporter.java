package com.接口练习;

public class PingPangSporter extends Sporter implements SpeakEnglish{
    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName()+"学打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println(getName()+"说英语");
    }


}
