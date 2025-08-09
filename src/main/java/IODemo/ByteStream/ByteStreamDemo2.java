package IODemo.ByteStream;

import java.io.*;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException{
        File path = new File("F:\\JavaProjects\\learn\\src\\main\\java\\IODemo\\ByteStream\\a.txt");
        FileOutputStream fos = new FileOutputStream(path);
        byte[] bytes = {95,96,97,98,99,100};
        fos.write(bytes, 2, 4);

        FileInputStream fis = new FileInputStream(path);
        int b1 = fis.read();
        System.out.println((char)b1);
        int b2 = fis.read();
        System.out.println((char)b2);
        int b3 = fis.read();
        System.out.println((char)b3);
        int b4 = fis.read();
        System.out.println((char)b4);
        fos.close();
    }
}
