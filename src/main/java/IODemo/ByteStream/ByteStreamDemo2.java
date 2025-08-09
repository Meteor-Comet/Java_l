package IODemo.ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException{
        File path = new File("F:\\JavaProjects\\learn\\src\\main\\java\\IODemo\\ByteStream\\a.txt");
        FileOutputStream fos = new FileOutputStream(path);
        byte[] bytes = {95,96,97,98,99,100};
        fos.write(bytes, 2, 4);
        fos.close();
    }
}
