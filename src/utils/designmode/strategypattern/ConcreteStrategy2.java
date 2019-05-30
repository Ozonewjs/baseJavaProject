package utils.designmode.strategypattern;

/**
 * @ClassName ConcreteStrategy2
 * @Author Ozone
 * @Description 具体策略实现2
 * @Date 2019/5/30 9:09
 * @Version 1.0
 **/
public class ConcreteStrategy2 implements IStrategy {
    @Override
    public void algorithmMethod(){
        System.out.println("this is ConcreteStrategy method...");
    }
}
