package utils.javajvm;

public class TestStaticLoadDemo {
    public static void main(String[] args) {
        StaticLoad staticLoad = StaticLoad.getStaticLoadInstance();
        StaticLoad2 staticLoad2 = StaticLoad2.getStaticLoadInstance();

        System.out.println("count1 = " + staticLoad.count1);
        System.out.println("count2 = " + staticLoad.count2);

        System.out.println("staticLoad2.count1 = " + staticLoad2.count1);
        System.out.println("staticLoad2.count2 = " + staticLoad2.count2);

    }
}
