package IODemo.ByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        File path = new File("F:\\JavaProjects\\learn\\src\\main\\java\\IODemo\\ByteStream\\b.txt");
//        FileOutputStream fos = new FileOutputStream(path, true);
        FileInputStream fis = new FileInputStream(path);
        File pathCopy = new File("F:\\JavaProjects\\learn\\src\\main\\java\\IODemo\\ByteStream\\b_copy.txt");
        FileOutputStream fos = new FileOutputStream(pathCopy);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();

    }
}
