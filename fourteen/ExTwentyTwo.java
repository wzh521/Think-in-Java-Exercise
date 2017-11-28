package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/28.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author:Administrator
 * @date:2017/11/28
 * @description:
 */
class DunamicProxyHandle implements InvocationHandler {
    private Object proxied;
    public DunamicProxyHandle(Object proxied){
        this.proxied=proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*** proxy: "+proxy.getClass()+" ,method: "+method+" ,args "+args);
        if(args!=null){
            for(Object arg:args){
                System.out.println(" "+arg);
            }
        }
        long start = System.nanoTime();
        Object ret = method.invoke(proxied, args);
        long duration = System.nanoTime() - start;
        System.out.println("METHOD-CALL TIME: " + duration);
        return ret;
    }

}
public class ExTwentyTwo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);
        Interface proxy =(Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                realObject.getClass().getInterfaces(),new DunamicProxyHandle(realObject));
        consumer(proxy);
    }

}
