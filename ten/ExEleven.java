package com.wzh.thik.in.java.ten;/**
 * Created by Administrator on 2017/11/15.
 */

/**
 * @author:Administrator
 * @date:2017/11/15
 * @description:
 */
class Outer6{
    private class Inner implements Interface{

        @Override
        public void f() {
            System.out.println("Inner f()");
        }
    }
    public Interface getInner(){
        return new Inner();
    }
    public Inner get2() { return new Inner(); }

}
public class ExEleven {


    public static void main(String[] args) {
       Outer6 outer6 = new Outer6();
        Interface i = outer6.getInner();
        System.out.println(i.getClass().getName());

        i = outer6.get2();
        System.out.println(i.getClass().getName());
        // Won't compile -- 'Inner' not visible:
        //! Inner i1 = out.get2();
        //! Inner i2 = (Inner)si;
    }
}
