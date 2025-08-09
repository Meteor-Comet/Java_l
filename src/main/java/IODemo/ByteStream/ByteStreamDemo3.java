package IODemo.ByteStream;

import java.io.*;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File path = new File("F:\\JavaProjects\\learn\\src\\main\\java\\IODemo\\ByteStream\\b.txt");
//        FileOutputStream fos = new FileOutputStream(path, true);
        FileOutputStream fos = new FileOutputStream(path);
        String content = "The highest mountain, the longest river";
        byte[] bytes1 = content.getBytes();
        fos.write(bytes1);
        String wrap = "\r\n";
        byte[] bytes2 = wrap.getBytes();
        fos.write(bytes2);
        String content2 = "is the only thing that you can't see from the top.";
        byte[] bytes3 = content2.getBytes();
        fos.write(bytes3);

        FileInputStream fis = new FileInputStream(path);
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char)b);
        }

        fos.close();
    }
}
