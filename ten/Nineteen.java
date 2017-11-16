package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/16.
 */

/**
 * @author:Administrator
 * @date:2017/11/16
 * @description:
 */
class Outer8{
    class Inner1 {
        class Inner2 { void f() {}
        }
        Inner2 makeInner2() { return new Inner2(); }
    }
    Inner1 makeInner1() {
        return new Inner1();
    }
    static class Nested1 {
        static class Nested2 {
            void f() {}
        }


        }
        void f() {}
}
public class Nineteen {
    public static void main(String[] args) {
        new Outer8().f();
        new Outer8.Nested1();
        new Outer8.Nested1.Nested2().f();
        Outer8.Inner1 inner1 =new Outer8().new Inner1();
        Outer8.Inner1.Inner2 inner2 = new Outer8().makeInner1().makeInner2();

    }
}
