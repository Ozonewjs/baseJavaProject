package utils.weakreference;

import utils.Apple;

public class TestWeakReference {
    public static void main(String[] args) {
        Audi salad = new Audi(new Car(2000,"blue"));
        //通过WeakReference的get()方法获取Apple
        System.out.println("Car:" + salad.get());
        System.gc();
        try {
            //休眠一下，在运行的时候加上虚拟机参数-XX:+PrintGCDetails，输出gc信息，确定gc发生了。
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //如果为空，代表被回收了
        if (salad.get() == null) {
            System.out.println("clear Car.");
        }
    }
}
