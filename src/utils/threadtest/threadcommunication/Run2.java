package utils.threadtest.threadcommunication;

/**
 * @ClassName Run2
 * @Author Ozone
 * @Description TODO
 * @Date 2019/6/5 15:08
 * @Version 1.0
 **/
public class Run2 {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        //线程A与线程B 持有的是同一个对象:object
        ThreadA a = new ThreadA(object);
        ThreadB b = new ThreadB(object);
        //new一个包含消费者类的线程
        Thread t1 = new Thread(a,"生产者1");
        Thread t3 = new Thread(a,"生产者2");
        Thread t5 = new Thread(a,"生产者3");

        //new一个包含生产者类的线程
        Thread t2 = new Thread(b,"消费者1");
        Thread t4 = new Thread(b,"消费者2");
        Thread t6 = new Thread(b,"消费者3");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
