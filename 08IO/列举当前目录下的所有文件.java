package IO包的相关;

import java.io.File;

public class 列举当前目录下的所有文件 {
    static int count = 0 ;
    public static void main(String[] args) {
        String path = "C:" + File.separator + "Users" + File.separator
                + "98650" + File.separator + "Desktop";
        System.out.println(path);
        File file = new File(path);
        new Thread(()->{
            long start = System.currentTimeMillis();
            listAllFiles(file);
            long end = System.currentTimeMillis();
            System.out.println("共花费：" + (end - start) + "毫秒");
            System.out.println("有" + count + "个文件");
        }).start();
    }
    public static void listAllFiles(File file){
        if (file.isFile()){
            count++;
//            System.out.println(file);
        } else {
            if (file.exists() && file.isDirectory()){
                File[] files = file.listFiles();
                for (File file1 : files){
                    listAllFiles(file1);
                }
            }
        }
    }
}
