package utils.threadtest.threadcommunication;

/**
 * @ClassName ThreadB
 * @Author Ozone
 * @Description 消费面包的方法
 * @Date 2019/6/5 13:49
 * @Version 1.0
 **/
public class ThreadB extends Thread{
    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run(){
        super.run();
        // 与生产者保持一致，本系统默认循环生产20个面包（生产几个，消费几个）
        for(int i = 0;i<3;i++){
            try {
                //沉睡0.3秒（演示效果需要，可以不加）
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //调用面包类里的生产面包的方法
            object.methodB();
        }
    }
}
