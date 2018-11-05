package utils;

import java.util.TreeSet;

/**
 * @author ozone
 */
public class Person {
    Integer age;
    public Person(int age){
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + "]";
    }
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>((Person o1, Person o2)->{
            if(o1.age > o2.age){
                return -1;
            }else if(o1.age == o2.age) {
                return 0;
            } else{
                return 1;
            }
        });
//        TreeSet<Person> persons = new TreeSet<>(new Comparator<Person>(){
//            @Override
//            public int compare(Person o1, Person o2) {
//                if(o1.age > o2.age){
//                    return -1;
//                }else if(o1.age == o2.age) {
//                    return 0;
//                } else{
//                    return 1;
//                }
//            }
//        });

        persons.add(new Person(2));
        persons.add(new Person(5));
        persons.add(new Person(6));
        //打印结果为[Person [age=6], Person [age=5], Person [age=2]]倒序
        System.out.println(persons);
    }
}
