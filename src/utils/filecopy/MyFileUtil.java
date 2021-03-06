package utils.filecopy;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName MyFileUtil
 * @Author Ozone
 * @Description 文件copy
 * @Date 2019/7/30 9:40
 * @Version 1.0
 **/
public class MyFileUtil {
    /**
     * @Author Ozone
     * @Description //文件copy
     * @Date 2019/7/30 10:31
     * @Param [source, target]
     * @return void
     **/
    public static void fileCopy(String source,String target) throws IOException {
        try(InputStream in = new FileInputStream(source)) {
            try(OutputStream out = new FileOutputStream(target)) {
                byte[] buffer = new byte[4096];
                int bytesToRead;
                while((bytesToRead = in.read(buffer)) != -1) {
                    out.write(buffer,0,bytesToRead);
                }
            }
        }
    }
    /**
     * @Author Ozone
     * @Description //文件copy
     * @Date 2019/7/30 10:32
     * @Param [source, target]
     * @return void
     **/
    public static void fileCopyNIO(String source,String target) throws IOException {
        try (FileInputStream in = new FileInputStream(source)){
            try (FileOutputStream out = new FileOutputStream(target)) {
                FileChannel inChannel = in.getChannel();
                FileChannel outChannel = out.getChannel();
                ByteBuffer buffer = ByteBuffer.allocate(4096);
                while(inChannel.read(buffer) != -1) {
                    buffer.flip();
                    outChannel.write(buffer);
                    buffer.clear();
                }
            }
        }
    }
    /**
     * @Author Ozone
     * @Description //统计给定文件中给定字符串的出现次数
     * @Date 2019/7/30 10:32
     * @Param [source, target]
     * @return void
     **/
    public static int countWordInFile(String filename,String word){
        int counter = 0;
        try (FileReader fr = new FileReader(filename)) {
            try (BufferedReader br = new BufferedReader(fr)) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    int index = -1;
                    while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
                        counter++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return counter;
    }
    
    public static void main(String [] args){
///        try {
//                MyFileUtil.fileCopy("d:/a.txt","d:/b.txt");
//        }catch (IOException e){
//                e.printStackTrace();
//        }
        try {
           System.out.println( MyFileUtil.countWordInFile("d:/a.txt","fa"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    

}
