package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
     File file = new File("F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo\\test.txt");
     boolean result = file.createNewFile();
     System.out.println(result);

     File file2 = new File("F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo\\test");
     boolean result2 = file2.mkdir();
     System.out.println(result2);

     File file3 = new File("F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo\\dir1");
     boolean result3 = file3.mkdirs();
     System.out.println(result3);
     System.out.println("===============================================");
     boolean[] result4 = {file.delete(), file2.delete(), file3.delete()};
     for (boolean b : result4) {
         System.out.println(b);
     }

     File file4 = new File("F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo");
     File[] list = file4.listFiles();
     for (File f : list) {
         System.out.println(f.getName());
     }
    }
}
