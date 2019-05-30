package utils.designmode.strategypattern;

/**
 * @ClassName ConcreteStrategy
 * @Author Ozone
 * @Description 具体策略实现
 * @Date 2019/5/30 9:07
 * @Version 1.0
 **/
public class ConcreteStrategy implements IStrategy {
    @Override
    public void algorithmMethod(){
        System.out.println("this is ConcreteStrategy method...");
    }
}
