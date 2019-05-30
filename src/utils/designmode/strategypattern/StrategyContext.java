package utils.designmode.strategypattern;

/**
 * @ClassName StrategyContext
 * @Author Ozone
 * @Description 策略上下文
 * @Date 2019/5/30 9:09
 * @Version 1.0
 **/
public class StrategyContext {
    //持有一个策略实现的引用
    private IStrategy strategy;
    //使用构造器注入具体的策略类
    public StrategyContext(IStrategy strategy) {
    this.strategy = strategy;
    }

    public void contextMethod(){
        //调用策略实现的方法
        strategy.algorithmMethod();
    }
}
