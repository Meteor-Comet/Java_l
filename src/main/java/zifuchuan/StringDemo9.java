package zifuchuan;

public class StringDemo9 {
    public static void main(String[] args) {
        String phone = "12345678901";
        String result = phone.substring(0, 3) + "****" + phone.substring(7, 11);
        System.out.println(result);
    }
}
