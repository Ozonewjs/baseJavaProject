package utils.streamtest;

import java.util.Date;

public class CouponInfo {
    public long a;
    public int b;
    public String c;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public CouponInfo(long a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
