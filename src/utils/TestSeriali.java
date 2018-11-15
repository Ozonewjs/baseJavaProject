package utils;

import java.io.*;

public class TestSeriali  implements Serializable {

        private String name;

        transient  private Integer age;//当某个字段被声明为transient后，默认序列化机制就会忽略该字段

        private String gender;

//        public TestSeriali() {
//            System.out.println("none-arg constructor");
//        }

        public TestSeriali(String name, Integer age, String gender) {
            System.out.println("arg constructor");
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        @Override
        public String toString() {
            return "[" + name + ", " + age + ", " + gender + "]";
        }
    public static void main(String[] args) throws Exception {
        File file = new File("person.out");

        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        TestSeriali person = new TestSeriali("John", 101, "MALE");
        System.out.println(person);
        oout.writeObject(person);
        oout.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        // 重新读取被保存的Person对象时，并没有调用Person的任何构造器，看起来就像是直接使用字节将Person对象还原出来的
        Object newPerson = oin.readObject(); // 没有强制转换到Person类型
        oin.close();
        System.out.println(newPerson);
    }
}
//    SimpleSerial，是一个简单的序列化程序，它先将一个Person对象保存到文件person.out中，然后再从该文件中读出被存储的Person对象，并打印该对象。




