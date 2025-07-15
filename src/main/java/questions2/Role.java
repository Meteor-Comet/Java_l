package questions2;

import java.util.Random;

public class Role {
    private String name;
    private int hp;

    public Role() {
    }


    public Role(String name, int hp) {
        this.name = name;
        this.hp = hp;
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
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }



    public void attack(Role role) {
        Random rand = new Random();
        int hurt = rand.nextInt(20)+1;
        role.setHp(role.getHp() - hurt);
        if (role.getHp() <= 0){
            role.setHp(0);
            System.out.println(role.getName() + "被K.O");
            return;
        }
        System.out.println(this.name + "攻击了" + role.getName() + "，造成了"+ hurt +"点伤害, "+ role.getName() + "剩余" + role.getHp() + "点血");
    }
}
