package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
interface Interface11{
    void f();
}
interface Interface21 extends Interface11{
    void g();
}
interface Interface31 extends Interface11{
    void h();
}
interface Interface41 extends Interface21,Interface31{
    void d();
}
class Impl implements Interface41{
    @Override
    public void d() {

    }

    @Override
    public void g() {

    }

    @Override
    public void h() {

    }

    @Override
    public void f() {

    }
}
public class ExThirteen {
    public static void main(String[] args) {
        Impl impl = new Impl();
        impl.f();
        impl.g();
        impl.h();
        impl.d();
    }
}
