package utils.dateutils;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @ClassName LocaDateTimeUtilsTest
 * @Description TODO
 * @Author Ozone
 * @Date 2019/5/27 0027 22:11
 * @Version 1.0
 **/
public class LocaDateTimeUtilsTest {
    public static void main(String [] args){
        //Date转String
        //使用Date和SimpleDateFormat
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("G yyyy年MM月dd号 E a hh时mm分ss秒");
        String format = simpleDateFormat.format(new java.util.Date());
        System.out.println(format);
        //使用jdk1.8 LocalDateTime和DateTimeFormatter
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern =
                DateTimeFormatter.ofPattern("G yyyy年MM月dd号 E a hh时mm分ss秒");
        String format1 = now.format(pattern);
        System.out.println(format1);

        //String转Date
        //使用Date和SimpleDateFormat
        SimpleDateFormat simpleDateFormata =
                new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try{
            Date date = simpleDateFormata.parse("2019-07-25 10:15:30");
            System.out.println(simpleDateFormata.format(date));
        }catch (Exception e){
            e.printStackTrace();
        }
        //使用jdk1.8 LocalDateTime和DateTimeFormatter
        DateTimeFormatter patternb =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //严格按照ISO yyyy-MM-dd验证，03写成3都不行
        LocalDateTime dt = LocalDateTime.parse("2019-07-25 10:15:30",patternb);
        System.out.println(dt.format(patternb));
        //java.time.Duration
        //此类用来计算两同类型日期的时间差,看演示
        LocalDateTime start = LocalDateTime.of(2017, 1, 1, 1, 1);
        LocalDateTime end = LocalDateTime.of(2017, 2, 1, 1, 1);

        Duration result = Duration.between(start, end);
        System.out.println(result.toDays());
        System.out.println(result.toHours());
        System.out.println(result.toMinutes());
        System.out.println(result.toMillis());
        System.out.println(result.toNanos());




    }

}
