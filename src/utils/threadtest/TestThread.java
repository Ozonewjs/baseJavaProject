package utils.threadtest;

/**
 * @ClassName TestThread
 * @Author Ozone
 * @Description 测试CountDownLatchTest
 * @Date 2019/5/27 14:44
 * @Version 1.0
 **/
public class TestThread {
    public static void main(String [] args){
//        for (int i = 0; i <2 ; i++) {
//            new CountDownLatchTest(i).go();
//        }
//
//        new Thread(){
//            public void run() {
//                new CountDownLatchTest(2).go();
//            }
//        }.start();
        SafeCollectionIteration safeCollectionIteration = new SafeCollectionIteration();
        safeCollectionIteration.ergodicArrylist("a");
//        new Thread(){
//            @Override
//            public void run(){
//                safeCollectionIteration.ergodicArrylist("a");
//            }
//        }.start();
//        new Thread(){
//            @Override
//            public void run(){
//                safeCollectionIteration.ergodicArrylist("bb");
//            }
//
//        }.start();
    }
}
