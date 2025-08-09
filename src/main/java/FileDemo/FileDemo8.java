package FileDemo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo8 {
    public static void main(String[] args) throws IOException
    {
        File file = new File("F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo");
        File[] files = file.listFiles((a, b) -> new File(a, b).isFile() && b.endsWith(".java"));
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
