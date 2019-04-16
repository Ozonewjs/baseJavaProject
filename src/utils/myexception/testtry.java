package utils.myexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class testtry {
    public static void main(String[] args) {
        String str = new testtry().openFile();
        System.out.println(str);

    }

    public String openFile() {
        try {
            FileInputStream inputStream = new FileInputStream("d:/a.txt");
            int ch = inputStream.read();
            System.out.println("aaa");
            return "step1";
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return "step2";
        }catch (IOException e) {
            System.out.println("io exception");
            return "step3";
        }finally{
            System.out.println("finally block");
            //不要在finally块中使用return，因为finally中的return会覆盖已有的返回值
            //return "finally";
        }
    }
}
