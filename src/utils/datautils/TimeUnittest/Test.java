package utils.datautils.TimeUnittest;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Test
 * @Author Ozone
 * @Description TODO
 * @Date 2019/5/29 10:07
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        //1天有24个小时    1代表1天：将1天转化为小时
        System.out.println(TimeUnit.DAYS.toHours(1));
        //结果： 24
        //1小时有3600秒
        System.out.println(TimeUnit.HOURS.toSeconds(1));
        //结果3600
        //把3天转化成小时
        System.out.println(TimeUnit.HOURS.convert(3, TimeUnit.DAYS));
        //结果是：72
        new Thread( new Runnable() {

            @Override
            public void run() {
                try {
//                    Thread.sleep( 5 * 1000 );
                    TimeUnit.SECONDS.sleep( 5 );
                    System.out.println( "延时5秒，完成了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();  ;
    }
}
