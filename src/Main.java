import utils.linkedlist.SingleLinkedList;

/**
 * @author ozone
 */
public class Main {

    public static void main(String[] args) {
        //构造代码块会在构造函数被调用时执行， 且在这个例子中比"this.id=id;"语句先执行，作用是给对象统一初始化数据;
//        StaticBlock test = new StaticBlock(3,"wjs");
//        StaticBlock test1 = new StaticBlock();
//        System.out.println(test);
//        System.out.println(test1);
        SingleLinkedList singleList = new SingleLinkedList();
        singleList.addHead("A");
        singleList.addHead("B");
        singleList.addHead("C");
        singleList.addHead("D");
        //打印当前链表信息
        singleList.display();
        singleList.deleteHead();
        singleList.display();
        boolean a = singleList.isEmpty();
        System.out.println(a);
        //删除C
        boolean b = singleList.delete("C");
        System.out.println(b);
        singleList.display();
        //查找B
        System.out.println(singleList.find("B"));
    }
}
