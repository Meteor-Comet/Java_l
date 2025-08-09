package IODemo.ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("F:\\JavaProjects\\learn\\src\\main\\java\\IODemo\\ByteStream\\a.txt");
        File path = new File("F:\\JavaProjects\\learn\\src\\main\\java\\IODemo\\ByteStream\\a.txt");
        FileOutputStream fos = new FileOutputStream(path);
        fos.write(97);
        fos.close();
    }
}
