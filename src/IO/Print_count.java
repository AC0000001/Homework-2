package IO;

import java.io.*;

public class Print_count {
    public static void main(String[] ssd) throws IOException {

        isDirectory(new File("C://Users//15123//Desktop//File"));
    }

    public static void isDirectory(File file) throws IOException {
        if(file.exists()){
            if (file.isFile()) {
//                System.out.println("file is ==>>" + file);


                BufferedReader in = new BufferedReader(new FileReader(file));  //打开输入流
                    String s;
                    while((s = in.readLine()) != null){//读字符串
                        System.out.println(s);          //写出
                    }




            }else{
                File[] list = file.listFiles();
                if (list.length == 0) {
                    System.out.println(file.getAbsolutePath() + " is null");
                } else {
                    for (int i = 0; i < list.length; i++) {
                        isDirectory(list[i]);//递归调用
                    }
                }
            }
        }else{
            System.out.println("文件不存在！");
        }
    }

}
