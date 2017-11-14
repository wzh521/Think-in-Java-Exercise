package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
abstract class AbstractTest {}
class ExportClass extends AbstractTest{
    public void f() {
        System.out.println("ExportClass.f");
    }
}
abstract class WithMethods {
    abstract public void f();
}

class Extended2 extends WithMethods {
    @Override
    public void f() {
    System.out.println("Extended2.f");
}
}
public class ExFour {
    public static void test(AbstractTest abstractTest){
        ((ExportClass)abstractTest).f();

    }
    public static void test2(WithMethods wm) {
        wm.f();
    }

    public static void main(String[] args) {
        AbstractTest abstractTest = new ExportClass();
        test(abstractTest);
        WithMethods wm = new Extended2();
        test2(wm);
    }
}
