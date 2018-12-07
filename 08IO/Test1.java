package IO包的相关;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        // 1获取路径
        String path = "C:" + File.separator + "User" + File.separator
                + "98650" + File.separator + "Desktop" +
                File.separator + "www" + File.separator +
                "aaa" + File.separator + "java" + File.separator +
                "testIO.java";
        File file = new File(path);

        // 2判断父路径是否存在，不存在就创建父路径
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdir();
        }
        // 3判断文件是否存在，不存在就创建文件
        if (file.exists()){
            System.out.println("文件已存在");
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
