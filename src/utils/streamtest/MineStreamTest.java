package utils.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MineStreamTest {
    private List<CouponInfo> couponInfoList;

    private List<String> strList;

    private List<Integer> intList;

    public void init() {
        CouponInfo couponInfo1 = new CouponInfo(123L, 10001, "5元现金券");
        CouponInfo couponInfo2 = new CouponInfo(124L, 10001, "10元现金券");
        CouponInfo couponInfo3 = new CouponInfo(125L, 10002, "全场9折");
        CouponInfo couponInfo4 = new CouponInfo(126L, 10002, "全场8折");
        CouponInfo couponInfo5 = new CouponInfo(127L, 10003, "全场7折");

        couponInfoList = new ArrayList<>();
        couponInfoList.add(couponInfo1);
        couponInfoList.add(couponInfo2);
        couponInfoList.add(couponInfo3);
        couponInfoList.add(couponInfo4);
        couponInfoList.add(couponInfo5);

        strList = Arrays.asList(new String[]{"A", "S", "D", "F", "X", "C", "Y", "H", "", null});

        intList = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 6, 2, 3});
    }

    /**
     * 迭代  forEach
     */
    public void testForEach() {
        strList.forEach(System.out::println);
        strList.forEach(e->System.out.print(e));
        System.out.println();
        strList.forEach(System.out::print);
    }

    /**
     * limit
     */
    public void testLimit() {
        List<String> list = strList.stream().limit(3).collect(Collectors.toList());
        System.out.println(list);
    }
    public static void main(String[] args) {
//        Integer[] sixNums = {1, 2, 3, 4, 5, 6};
//        Integer[] evens = Stream.of(sixNums).filter(n -> n%2 == 0).toArray(Integer[]::new);
//        System.out.println(Arrays.toString(evens));
//        String[] arr = new String[]{"yes", "YES", "no", "NO"};
//        Arrays.stream(arr).map(x -> x.toLowerCase()).forEach(System.out::println);
//        Integer[] arr1 = new Integer[]{1,2,3,4,5,6,7,8,9,10};
//        Arrays.stream(arr1).filter(x->x>3&&x<8).forEach(System.out::println);
        String[] arrflat1 = {"a", "b", "c", "d"};
        String[] arrflat2 = {"e", "f", "c", "d"};
        String[] arrflat3 = {"h", "j", "c", "d"};
        // Stream.of(arr1, arr2, arr3).flatMap(x -> Arrays.stream(x)).forEach(System.out::println);
        // flapMap：拆解流，将流中每一个元素拆解成一个流
        Stream.of(arrflat1, arrflat2, arrflat3)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        Stream<Integer> trans = Stream.of(11, 9, 2, 13, 1, 2, 99, 54, 23, 66, 70, 23, 46, 50, 100, 10, 24, 18, 19, 2);
        /**
         * @Author Ozone
         * @Description //假设有N条营业数据，前5条是无关的测试数据，
         * 中间10条是要参加考核的，参与考核的需要知道其中超过50w（包括50）的数据的交易额平均值，其他不参与考核的忽略。
         * 测试数据如下：
         * @Date 2019/6/28 16:09
         * @Param [args]
         * @return void
         **/
        IntSummaryStatistics all = trans
                // 前5条跳过，2, 99, 54, 23, 66, 70, 23, 46, 50, 100, 10, 24, 18, 19, 2
                .skip(5)
                // 取10条考核交易 2, 99, 54, 23, 66, 70, 23, 46, 50, 100
                .limit(10)
                // 将50以下的交易剔除 99, 54, 66, 70, 50, 100
                .filter(i -> i >= 50)
                // 转换成数字。如果是IntStream 则不需要转换
                .mapToInt(i->i)
                // 将流的统计结果放入包装对象中
                .summaryStatistics();
                // 交易总量 439w，平均值为439/6
        System.out.println(all.getAverage());
    }
}
