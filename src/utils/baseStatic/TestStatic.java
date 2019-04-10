package utils.baseStatic;

public class TestStatic {
    static int a;
    int b;
    static int c;

    public int aMethod() {
        a++;
        return a;
    }
    public int bMethod(){
        b++;
        return b;
    }
    public static int cMethod(){
        c++;
        return c;
    }
    TestStatic(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c= c;
    }
    public static void main(String[] args) {
        TestStatic t = new TestStatic(1,1,1);
        t.aMethod();
        System.out.println(t.aMethod());
        t.bMethod();
        System.out.println(t.bMethod());
        t.cMethod();
        System.out.println(t.cMethod());
    }
}
