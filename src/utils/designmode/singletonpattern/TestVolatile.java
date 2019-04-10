package utils.designmode.singletonpattern;

/**
 * @author ozone 测试volatile关键字
 */
public class TestVolatile {
    /*
    volatile保证可见性
     */
    private volatile int inc = 0;
    /*
    synchronized保证原子性
     */
    private synchronized  void increase() {
        inc++;
    }
    /*
    采用lock的方式保证原子性
     */
//    Lock lock = new ReentrantLock();
//
//    public  void increase() {
//        lock.lock();
//        try {
//            inc++;
//        } finally{
//            lock.unlock();
//        }
//    }
    public static void main(String[] args) {
        final TestVolatile test = new TestVolatile();
        for(int i=0;i<10;i++) {
            new Thread() {
                public void run() {
                    for (int j = 0; j < 100; j++)
                        test.increase();
                    System.out.print(test.inc + " ");
                }
            }.start();
        }
//        System.out.println(Thread.activeCount());
        while(Thread.activeCount()>2)  //保证前面的线程都执行完
            Thread.yield();
            System.out.println(test.inc);
    }

}
