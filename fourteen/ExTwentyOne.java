package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/28.
 */

/**
 * @author:Administrator
 * @date:2017/11/28
 * @description:
 */
interface Interface{
    void doSomething();
    void somethingElse(String args);
}
class RealObject implements Interface{
    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String args) {
        System.out.println("somethingElse "+args );
    }
}
class SimpleProxy   implements Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied=proxied;
    }
    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        long start = System.nanoTime();
        proxied.doSomething();
        long duration = System.nanoTime() - start;
        System.out.println("METHOD-CALL TIME: " + duration);
    }

    @Override
    public void somethingElse(String args) {
        System.out.println("SimpleProxy somethingElse "+args);
        long start = System.nanoTime();
        proxied.somethingElse(args);
        long duration = System.nanoTime() - start;
        System.out.println("METHOD-CALL TIME: " + duration);

    }
}
public class ExTwentyOne {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
