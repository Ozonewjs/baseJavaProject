package utils.threadtest.threadcommunication;

/**
 * @ClassName Run
 * @Author Ozone
 * @Description TODO
 * @Date 2019/6/5 13:50
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        //线程A与线程B 持有的是同一个对象:object
        ThreadA a = new ThreadA(object);
        ThreadB b = new ThreadB(object);
        //new一个包含消费者类的线程
        Thread t1 = new Thread(a,"生产者");

        //new一个包含生产者类的线程
        Thread t2 = new Thread(b,"消费者");
        t1.start();
        t2.start();
    }
}
