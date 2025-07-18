package overridedemo;

public class Manger extends Employee{
    private double bonus;

    public Manger() {
    }

    public Manger(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
