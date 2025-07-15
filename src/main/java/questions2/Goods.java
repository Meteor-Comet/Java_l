package questions2;

public class Goods {
    private String id;
    private String name;
    private double price;
    private int num;

    public Goods() {
    }

    public Goods(String id, String name, double price, int num) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return num
     */
    public int getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }

    public String toString() {
        return "Goods{id = " + id + ", name = " + name + ", price = " + price + ", num = " + num + "}";
    }
}
