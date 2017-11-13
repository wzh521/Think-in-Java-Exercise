package com.wzh.thik.in.java.eight;

/**
 * Created by Administrator on 2017/10/22.
 */
public class Exercise2 {
    public static void main(String[] args) {

    }
}
abstract  class NoAbstract{
    void f(){
        System.out.println("hello");
    }
}
class TestMethod extends  NoAbstract{
    void g(){
        System.out.println("testmethod + g()");
    }
}


class A{
    interface B{
        void f();
    }
    public class Bimp implements B{
        public void f(){}
    }
    private  class Bimp2 implements B{
        public void f(){}
    }
    public interface C {
        void f();
    }
    class Cimp implements  C{
        public void f(){}
    }
    private class Cimp2 implements C{
        public void f(){}
    }
}