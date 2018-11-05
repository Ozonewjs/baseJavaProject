package utils;

import java.util.HashMap;

/**
 * @author ozone
 */
public class Apple {
    private String color;

    public Apple(String color) {
        this.color = color;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Apple)) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        return this.color == ((Apple) obj).color;
    }
    @Override
    public int hashCode(){
        //此种实现,要求 color值定以后就不得修改
        //否则同一个物理对象,前后有两个不同的hashCode,逻辑上就是错的
        return this.color.length();
    }
    public static void main(String[] args) {
        Apple a1 = new Apple("green");
        Apple a2 = new Apple("red");

        //hashMap stores apple type and its quantity
        HashMap<Apple, Integer> m = new HashMap<>(16);
        m.put(a1, 10);
        m.put(a2, 20);
        System.out.println(m.get(new Apple("green")));
        System.out.println(CnNumberUtils.toUppercase(3342342.45));
    }
}