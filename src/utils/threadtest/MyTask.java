package utils.threadtest;

/**
 * @ClassName MyTask
 * @Author Ozone
 * @Description 创建线程任务
 * @Date 2019/5/24 10:58
 * @Version 1.0
 **/
public class MyTask implements Runnable{
    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}
