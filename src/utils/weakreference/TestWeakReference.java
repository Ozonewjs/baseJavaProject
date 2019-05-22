package utils.weakreference;

import java.lang.ref.WeakReference;

public class TestWeakReference {
    public static void main(String[] args) {

        Car car = new Car(22000,"silver");
        WeakReference<Car> weakCar = new WeakReference<>(car);
//        int i=0;
//        while(true){
////            System.out.println("this is strong reference "+i+" loops - "+car);
//            if(weakCar.get()!=null){
//                i++;
//                System.out.println("Object is alive for "+i+" loops - "+weakCar);
//            }else{
//                System.out.println("Object has been collected.");
//                break;
//            }
//        }
        String b="abc";

        String a=new String("abc");
        System.out.println((a==b)? "true":"false");
        if(a.equals(b)){
            System.out.println("a等于b");
        }
        System.out.println(a.compareTo(b));
    }
}
