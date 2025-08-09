package FileDemo;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String path = "F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo\\FileDemo1.java";
        File file = new File(path);
        System.out.println("文件名：" + file.getName());

        File parentPath = file.getParentFile();
        File file2 = new File(parentPath, "FileDemo2.java");
        System.out.println("父目录：" + parentPath.getAbsolutePath());
    }
}
