package utils.designmode.commandmode;

/**
 * 实现了请求接口的实体类
 */
public class MyCommand implements Command {
    private Receiver receiver;
    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void exe() {
        receiver.action();
    }

}
