package IO包的相关;

import java.io.*;

public class 文件读取 {
    public static void main(String[] args) throws IOException {
        //1.取得终端对象
        //2.根据终端对象取得输入输出流
        //3.根据输入输出流进行数据读取与写入
        //4.关闭流
        File file = new File(
                "C:" + File.separator + "Users" + File.separator
                        + "98650" + File.separator + "Desktop" + File.separator + "TestIO.txt"
        );
        OutputStream outputStream = new FileOutputStream(file, true);
        String str = "hello";
        outputStream.write(str.getBytes(), 6 ,5);
        outputStream.close();

    }

}
