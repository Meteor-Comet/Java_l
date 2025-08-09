package FileDemo;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("F:\\JavaProjects\\learn\\src\\main\\java\\FileDemo\\FileDemo1.java");
        // 获取文件名
        System.out.println(file.getName());
        // 获取文件绝对路径
        System.out.println(file.getAbsolutePath());
        // 获取文件父目录
        System.out.println(file.getParent());
        // 获取文件大小
        System.out.println(file.length()/1024.0+"kb");
        // 判断文件是否存在
        System.out.println(file.exists());
        // 获取文件最后修改时间
        System.out.println(file.lastModified());
    }
}
