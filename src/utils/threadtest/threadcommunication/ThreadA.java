package utils.threadtest.threadcommunication;

/**
 * @ClassName ThreadA
 * @Author Ozone
 * @Description 生产面包的方法
 * @Date 2019/6/5 13:46
 * @Version 1.0
 **/
public class ThreadA extends Thread {
    private MyObject object;

    public ThreadA(MyObject object) {
        this.object = object;
    }

    @Override
    public void run(){
        super.run();
        for (int i = 0; i <3; i++) {
            try {
                //沉睡0.3秒（演示效果需要，可以不加）
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //调用面包类里的生产面包的方法
            object.methodA();
        }
    }

}
