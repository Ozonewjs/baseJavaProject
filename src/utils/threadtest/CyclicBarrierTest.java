package utils.threadtest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
/**
 * @author Ozone
 * @description 让所有线程都等待完成后才会继续下一步行动,用于多线程计算数据，最后合并计算结果的场景
 * @date 2019/8/8 9:10
 * @param
 * @return
 **/
public class CyclicBarrierTest {
    public static void main(String[] args) {

        int N = 4;

        CyclicBarrier barrier  = new CyclicBarrier(N);
        CyclicBarrier barrier2;
//        barrier2 = new CyclicBarrier(N,()-> {
//                System.out.println(Thread.currentThread().getName() + " 完成最后任务");
//        });
        barrier2 = new CyclicBarrier(N,new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " 完成最后任务");
            }
        });
        for(int i=0;i<N;i++) {
            new Writer(barrier2).start();
        }
        System.out.println("aaaa");
    }

    static class Writer extends Thread{

        private CyclicBarrier cyclicBarrier;

        private Writer(CyclicBarrier cyclicBarrier) {

            this.cyclicBarrier = cyclicBarrier;

        }
        @Override

        public void run() {

            System.out.println("线程"+Thread.currentThread().getName()+"正在写入数据...");

            try {
                //以睡眠来模拟写入数据操作
                Thread.sleep(5000);

                System.out.println("线程"+Thread.currentThread().getName()+"写入数据完毕，等待其他线程写入完毕");

                cyclicBarrier.await();

            } catch (InterruptedException | BrokenBarrierException e) {

                e.printStackTrace();

            }

//            System.out.println("所有线程写入完毕，继续处理其他任务...");

        }

    }
}
