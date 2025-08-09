package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
     File file = new File("F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo\\test.txt");
     boolean result = file.createNewFile();
     System.out.println(result);
    }
}
