package utils.LinkedList;

public class StackSingleLink {
    private SingleLinkedList link;

    public StackSingleLink(){
        link = new SingleLinkedList();
    }

    //添加元素
    public void push(Object obj){
        link.addHead(obj);
    }

    //移除栈顶元素
    public Object pop(){
        Object obj = link.deleteHead();
        return obj;
    }

    //判断是否为空
    public boolean isEmpty(){
        return link.isEmpty();
    }

    //打印栈内元素信息
    public void display(){
        link.display();
    }
    public static void main(String[] args){
        StackSingleLink ssl = new StackSingleLink();
        ssl.push("A");
        ssl.push("B");
        ssl.display();
        ssl.pop();
        boolean a = ssl.isEmpty();
        System.out.println(a);
        ssl.display();
    }

}
