package utils.threadtest;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * @author Ozone
 * @description 用于两个工作线程之间交换数据的封装工具类
 * @date 2019/8/8 9:55
 **/
public class ExchangerTest {
    private static final Exchanger<String> exgr = new Exchanger<>();
    private static ExecutorService threadPool = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        threadPool.execute(()->{
            try {
                String A = "银行流水A";// A录入银行流水数据
                String B = exgr.exchange(A);
                System.out.println(B);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        threadPool.execute(()->{
            try {
                String B = "银行流水B";// B录入银行流水数据
                String A = exgr.exchange("B__");
                System.out.println("A和B数据是否一致：" + A.equals(B) + ",A录入的是：" + A + ",B录入是：" + B);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
    }
}
