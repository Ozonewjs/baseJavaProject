package utils;

/**
 * @author ozone
 */
public class StaticBlock  {
    private int id;
    private String name;
    static{
        System.out.println("我是静态代码块");
    }
    public StaticBlock(int id,String name){
        this.id = id;
        this.name = name;
        System.out.println("构造函数");
    }
    public StaticBlock(){
        System.out.println("无参构造函数");
    }
    {
        this.id = 5;
        this.name = "测试";
        System.out.println("这是构造代码块");
    }
    public String toString(){

        return "name: "+this.name+"id:"+this.id ;

    }

}
