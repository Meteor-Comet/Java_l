package com.questions.questions2;

import java.util.Random;

public class Role2 {
    private String name;
    private int hp;
    private String gender;
    private String face;
    String[] boyfaces={"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};
    String[] attacks_desc= {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。",
    };
    String[] injureds_desc= {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };
    public Role2() {
    }

    public Role2(String name, int hp, String gender) {
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        setFace(gender);
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * 设置
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     * @param face
     */
    public void setFace(String face) {
        Random r = new Random();
        if(this.gender.equals("男")){
            this.face = boyfaces[r.nextInt(boyfaces.length)];
        }
        else{
            this.face = girlfaces[r.nextInt(girlfaces.length)];
        }
    }


    public void attack(Role2 role) {
        Random r = new Random();
        int[] attacks = {0,3,6,9,12,15,18,21};
        int index = r.nextInt(injureds_desc.length);
        System.out.printf(attacks_desc[r.nextInt(attacks_desc.length)]+"\n", this.name, role.getName());
        System.out.printf(injureds_desc[index]+"\n", role.getName());
        role.setHp(role.getHp() - attacks[index]);
        if (role.getHp() <= 0){
            role.setHp(0);
            System.out.println(role.getName() + "被K.O");
            return;
        }
        System.out.println(this.name + "攻击了" + role.getName() + "，造成了"+attacks[index] +"点伤害, "+ role.getName() + "剩余" + role.getHp() + "点血\n");
    }


    public void show(){
        System.out.println("角色信息：");
        System.out.println("姓名：" + this.name);
        System.out.println("性别:" + this.gender);
        System.out.println("血量：" + this.hp);
        System.out.println("长相:" + this.face);
    }
}
