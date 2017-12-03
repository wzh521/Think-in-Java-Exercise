package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/11/30.
 */

/**
 * @author:Administrator
 * @date:2017/11/30
 * @description:
 */
interface Test{
     void f();
     void g();
}
class  Test1 implements  Test{
    @Override
    public void f() {
        System.out.println("test1 f()");
    }

    @Override
    public void g() {
        System.out.println("test1 g()");

    }
    public void h(){
        System.out.println("test1 h()");
    }
}
class Test2{
    static <T extends Test> void test(T obj){
        obj.f();
        obj.g();
        //obj.h()
    }
}
public class ExTwenty {
    public static void main(String[] args) {
        Test2.test(new Test1());
    }

}
