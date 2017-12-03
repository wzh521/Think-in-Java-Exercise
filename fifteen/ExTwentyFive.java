package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/2.
 */

/**
 * @author:Administrator
 * @date:2017/12/2
 * @description:
 */
interface Top{
    void a();
    void b();
}
interface Low{
    void c();
    void d();
}
class TopLowImpl implements Top, Low {

    public void a() { System.out.println("Top::a()"); }
    public void b() { System.out.println("Top::b()"); }
    public void c() { System.out.println("Low::c()"); }
    public void d() { System.out.println("Low::d()"); }
}

public class ExTwentyFive {
    public static <T extends Top> void top( T obj){
        obj.a();
        obj.b();
    }
    static <T extends Low> void low(T obj) {
        obj.c();
        obj.d();
    }

    public static void main(String[] args) {
        TopLowImpl tli = new TopLowImpl();
        top(tli);
        low(tli);
    }
}
