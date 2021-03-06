package utils.designmode.singletonpattern;

/**
 * @author ozone
 */
public class Hello {
    static{
        System.out.println("我是Hello类");
    }
    public static void main(String[] args){
        Color color=Color.RED;
        int counter=10;
        while (counter-->0){
            switch (color){
                case RED:
                    System.out.println("Red");
                    color=Color.BLUE;
                    break;
                case BLUE:
                    System.out.println("Blue");
                    color=Color.GREEN;
                    break;
                case GREEN:
                    System.out.println("Green");
                    color=Color.YELLOW;
                    break;
                case YELLOW:
                    System.out.println("YELLOW");
                    color=Color.RED;
                    break;
            }
        }
        SingletonDemo instance = SingletonDemo.INSTANCE;
        instance.otherMethods();
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
    }
}
