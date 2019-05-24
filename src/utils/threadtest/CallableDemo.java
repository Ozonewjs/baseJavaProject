package utils.threadtest;
import java.util.concurrent.*;

/**
 * 获取线程返回结果
 */
public class CallableDemo {

    static class SumTask implements Callable<Long> {
        int num;
        private SumTask(int num){
            this.num = num;
        }
        @Override
        public Long call()  {
            long sum = 0;
            try{
                for (int i = 0; i < num; i++) {
                    sum += i;
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return sum;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Start:" + System.nanoTime());
        Executor executor= Executors.newSingleThreadExecutor();

        for (int i = 10000; i < 10010; i++) {
            FutureTask<Long> futureTask = new FutureTask<>(new SumTask(i));
            executor.execute(futureTask);
            System.out.println(futureTask.get());
        }
        System.out.println("End:" + System.nanoTime());
    }

}
