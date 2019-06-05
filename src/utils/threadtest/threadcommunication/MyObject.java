package utils.threadtest.threadcommunication;

/**
 * @ClassName MyObject
 * @Author Ozone
 * @Description 传统线程通信synchronized + wait + notify
 * @Date 2019/6/5 13:44
 * @Version 1.0
 **/
public class MyObject {
    private int bid;
    private int num;

    public MyObject(int bid, int num) {
        this.bid = bid;
        this.num = num;
    }
    public MyObject() {
       super();
    }
    synchronized public void methodA(){

        while(0 != num){
            try {
                wait();//等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //当面包数量为0时，那么就开始生产面包了哦
        //数量加1
        num  =  num +1;
        //id当然也得加1
        bid = bid + 1 ;
        String threadname = Thread.currentThread().getName();
        System.out.println(threadname+"生产了一个编号为"+bid+"的面包！");
//        notify();//当执行完后，去唤醒其他处于等待的线程
        notifyAll();//当执行完后，去唤醒其他处于等待的线程
    }
    synchronized public void methodB(){
        while (num == 0 ){
            try {
                wait();//等待
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //消费完面包了，所以面包数量降为0了
        //数量减1
        num  =  num -1;
        String name1 = Thread.currentThread().getName();
        System.out.println(name1+"买了一个面包编号为"+bid);
//        notify();//当执行完后，去唤醒其他处于等待的线程
        notifyAll();//当执行完后，去唤醒其他处于等待的线程
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
