package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
class Outer5 {
    class Inner {
    private int j;
        private void h() {
        System.out.println("Inner.h called");
            System.out.println("Inner.j = " + j);
    }
}
    public void testInnerAccess() {
        Inner i = new Inner();
        i.j = 47;
        i.h();
    }
}
public class ExEight {
    public static void main(String[] args) {
        Outer5 outer5 = new Outer5();
        outer5.testInnerAccess();
    }
}
