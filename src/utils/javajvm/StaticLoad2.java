package utils.javajvm;

public class StaticLoad2 {
 //   非法的引用
//    static {
//        System.out.println("count1:"+count1+"count2:"+count2);
//    }
    public static int count1;
    public static int count2 = 0;
    static {
        System.out.println("1:count1="+count1+" ;count2="+count2);
    }
    private static StaticLoad2 staticLoad = new StaticLoad2();
    static {
        System.out.println("2:count1="+count1+" ;count2="+count2);
    }
    private StaticLoad2() {
        count1++;
        count2++;
    }

    public static StaticLoad2 getStaticLoadInstance(){
        return staticLoad;
    }
}
