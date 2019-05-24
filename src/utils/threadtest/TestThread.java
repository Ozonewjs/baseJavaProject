package utils.threadtest;

public class TestThread {
    public static void main(String [] args){
        for (int i = 0; i <2 ; i++) {
            new CountDownLatchTest(i).go();
        }

        new Thread(){
            public void run() {
                new CountDownLatchTest(2).go();
            }
        }.start();


    }
}
