package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOCopy {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\itcast\\123.txt");

        FileOutputStream fileOutputStream = new FileOutputStream("myBateSteam\\123.txt");

        //读写
        int by;
        while((by = fileInputStream.read()) != -1){
            fileOutputStream.write(by);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }


}
