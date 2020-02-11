package utils.threadtest.reentrantlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ConditionTest
 * @Author Ozone
 * @Description 结合Condition实现等待通知机制(线程通信)
 * @Date 2019/6/3 16:48
 * @Version 1.0
 **/
public class ConditionTest {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    public static void main(String[] args) throws InterruptedException {

        lock.lock();
        new Thread(new SignalThread()).start();
        System.out.println("主线程等待通知");
        try {
            condition.await();
        } finally {
            lock.unlock();
        }
        System.out.println("主线程恢复运行");
    }
    static class SignalThread implements Runnable {

        @Override
        public void run() {
            lock.lock();
            try {
                condition.signal();
                System.out.println("子线程通知");
            } finally {
                lock.unlock();
            }
        }
    }
}
