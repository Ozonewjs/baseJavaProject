package utils.myannotation;

import java.lang.annotation.*;

/**
 * @author ozone
 */
public class UseCase  {

//     4.注解的作用目标：
//     　 @Target(ElementType.TYPE)                      // 接口、类、枚举、注解
//    　　@Target(ElementType.FIELD)                     // 字段、枚举的常量
//    　　@Target(ElementType.METHOD)                 // 方法
//    　　@Target(ElementType.PARAMETER)            // 方法参数
//    　　@Target(ElementType.CONSTRUCTOR)       // 构造函数
//    　　@Target(ElementType.LOCAL_VARIABLE)   // 局部变量
//    　　@Target(ElementType.ANNOTATION_TYPE) // 注解
//    　　@Target(ElementType.PACKAGE)               // 包
//    5.注解包含在javadoc中：
//    　　@Documented
//    6.注解可以被继承：
//    　　@Inherited

    @Retention(RetentionPolicy.RUNTIME)
    @Inherited
    @Documented
    @Target({ElementType.FIELD,ElementType.METHOD})
    @interface MyAnno{
         String name() default "zhangsan";
         String email() default "hello@example.com";
    }
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UseCases{
         String id();
         String description() default "no description";
    }
}
