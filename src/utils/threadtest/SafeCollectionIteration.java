package utils.threadtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName SafeCollectionIteration
 * @Author Ozone
 * @Description 测试对象锁
 * @Date 2019/5/27 14:44
 * @Version 1.0
 **/
public class SafeCollectionIteration  {
    public  void ergodicArrylist(String ss){
        //为了安全起见，仅使用同步列表的一个引用，这样可以确保控制了所有访问
        //集合必须同步化，这里是一个List
        List<String> wordList = Collections.synchronizedList(new ArrayList());
        //wordList中的add方法是同步方法，会获取wordList实例的对象锁
        wordList.add(ss);
        //获取wordList实例的对象锁，
        //迭代时，阻塞其他线程调用add或remove等方法修改元素
        new Thread(){
            @Override
            public void run(){
                try{
                    wordList.add("ab");
                    System.out.println("List Length1: " + wordList.size());
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }.start();
        synchronized ( wordList ) {
            Iterator iter = wordList.iterator();
            while ( iter.hasNext() ) {
                String s = (String) iter.next();
                System.out.println("found string: " + s + ", length=" + s.length());
            }
        }
        System.out.println("List Length: " + wordList.size());

    }
}
