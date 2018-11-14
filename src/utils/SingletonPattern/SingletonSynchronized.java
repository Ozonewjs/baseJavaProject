package utils.SingletonPattern;

/**
 * @author ozone 懒汉式，线程安全
 */
public class SingletonSynchronized {
    private static SingletonSynchronized instance;
    private static synchronized SingletonSynchronized getInstance(){
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return  instance;
    }
    private void showMessage(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingletonSynchronized object = SingletonSynchronized.getInstance();
        object.showMessage();
        //显示消息
//        object.showMessage();
    }
}
