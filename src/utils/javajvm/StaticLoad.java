package utils.javajvm;

public class StaticLoad {

    private static StaticLoad staticLoad = new StaticLoad();

    public static int count1;
    public static int count2 = 0;
    static {
        System.out.println("count1="+count1+" ;count2="+count2);
    }
    private StaticLoad() {
        count1++;
        count2++;
    }

    public static StaticLoad getStaticLoadInstance(){
        return staticLoad;
    }
}
