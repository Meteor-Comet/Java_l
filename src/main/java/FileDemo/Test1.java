package FileDemo;

import java.io.File;
import java.util.Scanner;

public class Test1 {
    // 计数器，用于统计找到的文件数量
    private static int fileCount = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("请输入要搜索的盘符（例如 C:\\）：");
        String drive = scanner.nextLine();
        
        System.out.println("请输入要搜索的文件后缀（例如 .txt）：");
        String extension = scanner.nextLine();
        
        File driveFile = new File(drive);
        if (!driveFile.exists()) {
            System.out.println("指定的盘符不存在！");
            return;
        }
        
        System.out.println("正在搜索 " + drive + " 中所有后缀为 " + extension + " 的文件...");
        System.out.println("找到的文件：");
        searchFiles(driveFile, extension);
        
        System.out.println("\n搜索完成，总共找到 " + fileCount + " 个文件。");
    }
    
    /**
     * 递归搜索指定目录下的文件
     * @param directory 要搜索的目录
     * @param extension 文件后缀
     */
    public static void searchFiles(File directory, String extension) {
        // 获取目录下的所有文件和子目录
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // 如果是目录，则递归搜索
                    searchFiles(file, extension);
                } else if (file.isFile()) {
                    // 如果是文件，检查后缀是否匹配
                    if (file.getName().endsWith(extension)) {
                        System.out.println(file.getAbsolutePath());
                        fileCount++; // 增加计数器
                    }
                }
            }
        }
    }
}