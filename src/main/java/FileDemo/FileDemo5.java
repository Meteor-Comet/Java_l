package FileDemo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        File[] arr = File.listRoots();
        for (File file : arr) {
            System.out.println(file);
        }

        File file = new File("F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo");
        String[] list = file.list();
        if (list != null) {
            for (String s : list){
                System.out.println(s);
            }
        }

        File file2 = new File("F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo");
        String[] listFiles = file2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);

                return file.isFile() && name.contains("4");
            }
        });
        System.out.println(Arrays.asList(listFiles));
    }
}
