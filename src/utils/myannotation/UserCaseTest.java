package utils.myannotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static utils.myannotation.UseCase.MyAnno;
import static utils.myannotation.UseCase.UseCases;
/**
 * @author ozone
 */
public class UserCaseTest {
    public static void main(String[] args) {
        Method[] methods = User.class.getMethods();
        //Field[] fields = User.class.getFields();
        Field[] fields = User.class.getDeclaredFields();

//    getFields：只能访问public属性及继承到的public属性
//    getDeclaredFields：只能访问到本类的属性，不能访问继承到的属性
//
//    getMethods：只能访问public方法及继承到的public方法
//    getDeclaredMethods：只能访问到本类的方法，不能访问继承到的方法
//
//    getConstructors：只能访问public构造函数及继承到的public构造函数
//    getDeclaredConstructors：只能访问到本类的构造函数，不能访问继承到的构造函数


        for (Field field : fields) {
            UseCase.MyAnno annotation = field.getAnnotation(MyAnno.class);
            if(annotation!=null){
                System.out.println("property="+annotation.name());
            }
        }
        for (Method method : methods) {
            MyAnno annotation = method.getAnnotation(MyAnno.class);
            if(annotation!=null){
                System.out.println("sayHello="+annotation.name());
            }
        }
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47);
        trackUseCases(useCases, PasswordUtils.class);
    }
    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            //获得注解的对象
            UseCases uc = m.getAnnotation(UseCases.class);
            if (uc != null) {
                System.out.println("Found Use Case:" + uc.id() + " "
                        + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }
}
