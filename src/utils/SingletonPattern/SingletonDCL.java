package utils.SingletonPattern;

/**
 * @author ozone 双检锁/双重校验锁
 */
public class SingletonDCL {
    private volatile static SingletonDCL instance;
    private SingletonDCL(){}
    private static SingletonDCL getInstance(){
        if (instance == null) {
            synchronized (SingletonDCL.class){
                instance = new SingletonDCL();
            }
        }
        return instance;
    }
    private void showMessage(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingletonDCL object = SingletonDCL.getInstance();
        object.showMessage();
        //显示消息
//        object.showMessage();
    }
}
