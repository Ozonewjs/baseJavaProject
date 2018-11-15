package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ozone
 *
 */
public class TestLinkedHashMap {
    public static void main(String[] args)
    {
        LinkedHashMap<String, String> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("111", "111");
        linkedHashMap.put("222", "222");
        linkedHashMap.put("333", "333");
        linkedHashMap.put("444", "444");
        loopLinkedHashMap(linkedHashMap);
        linkedHashMap.get("111");
        loopLinkedHashMap(linkedHashMap);
        linkedHashMap.put("222", "2222");
        loopLinkedHashMap(linkedHashMap);
        fileRead();
    }

    public static void loopLinkedHashMap(LinkedHashMap<String, String> linkedHashMap)
    {
        Set<Map.Entry<String, String>> set = linkedHashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
    }
    public static void fileRead()  {
        try{
            /*
            定义一个fileReader对象，用来初始化BufferedReader
             */
            FileReader reader = new FileReader("C:\\Users\\ozone\\Desktop\\socketTest.txt");
            /*
            new一个BufferedReader对象，将文件内容读取到缓存
             */
            BufferedReader bReader = new BufferedReader(reader);
            /*
            定义一个字符串缓存，将字符串存放缓存中
             */
            StringBuilder sb = new StringBuilder();
            String s ;
            /*
            逐行读取文件内容，不读取换行符和末尾的空格
            将读取的字符串添加换行符后累加存放在缓存中
             */
            while ((s = bReader.readLine()) != null) {
                sb.append(s + "\n");
                System.out.println(s);
            }
            String str = sb.toString();
            System.out.println(str);
            bReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
