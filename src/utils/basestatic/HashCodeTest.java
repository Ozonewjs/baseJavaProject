package utils.basestatic;

import java.util.HashMap;

/**
 * @ClassName HashCodeTest
 * @Author Ozone
 * @Description 测试equals和hashCode方法
 * @Date 2019/6/5 16:39
 * @Version 1.0
 **/
public class HashCodeTest {
    public static void main(String[] args) {

        People p1 = new People("Jack", 12);
        People p2 = new People("Jack", 12);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
        HashMap<People, Integer> hashMap = new HashMap<People, Integer>(16);
        hashMap.put(p1, 1);
        p1.setAge(13);
        System.out.println(hashMap.get(p1));
    }

}
