package com.接口练习;

public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(getName()+"教打乒乓球");
    }


    @Override
    public void speak() {
        System.out.println(getName()+"说英语");
    }
}
