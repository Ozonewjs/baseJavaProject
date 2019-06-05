package utils.designmode.productandconsumerpattern;

/**
 * @ClassName Test1
 * @Author Ozone
 * @Description 测试生产者消费者
 * @Date 2019/5/29 16:03
 * @Version 1.0
 **/
public class Test1 {
    /** //代表生产的商品数量 **/
    private static Integer count = 0;
    /** //代表商品最多多少个（也就是缓冲区大小）**/
    private static final Integer FULL = 10;
    /** //锁对象  ----分析1 **/
    private static final Object LOCK = new Object();
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //创造一堆生产者和消费者模拟真实环境
            new Thread(new Product()).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(new Consumer()).start();
        }
    }
    static  class Product implements Runnable {
        @Override
        public void run() {
            //一次多生产几个商品
            for (int i = 0; i < 10; i++) {
                try {
                    //模拟真实环境，让生产的慢一点，间隔3秒
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //线程同步
                synchronized (LOCK) {
                    //当缓冲区满了
                    while (count.equals(FULL)) {
                        try {
                            LOCK.wait();   //让线程等待  ----分析1
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count++;  //缓冲区不满时继续生产商品，商品加一
                    System.out.println(Thread.currentThread().getName() + "生产者生产，目前总共有" + count);
                    LOCK.notifyAll(); //唤醒等待的消费者
                }
            }
        }

    }
    static   class Consumer implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (LOCK) {
                    //当没有商品时，需要等待生产者生产商品
                    while (count == 0) {
                        try {
                            LOCK.wait();   //----分析 2
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    count--; //商品被消耗，商品减一
                    System.out.println(Thread.currentThread().getName() + "消费者消费，目前总共有" + count);
                    LOCK.notifyAll();  //商品被消耗后，通知等待的生产者
                }
            }
        }
    }
}
