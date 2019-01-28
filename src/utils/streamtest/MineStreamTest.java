package utils.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
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
        strList.stream().forEach(System.out::println);
        strList.stream().forEach(e->System.out.print(e));
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
        Integer[] sixNums = {1, 2, 3, 4, 5, 6};
        Integer[] evens = Stream.of(sixNums).filter(n -> n%2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evens));
    }
}
