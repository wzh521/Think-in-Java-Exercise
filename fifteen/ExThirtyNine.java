package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
class MixinProxy implements InvocationHandler{
    Map<String,Object> delegateByMethod;
    public MixinProxy(TwoTuple<Object,Class<?>>... pairs){
        for(TwoTuple<Object,Class<?>> pair:pairs){
            for(Method method:pair.second.getMethods()){
                String methodName=method.getName();
                if (!delegateByMethod.containsKey(methodName)) {
                    delegateByMethod.put(methodName,pair.first);
                }
                }
            }
        }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegate =delegateByMethod.get(methodName);

        return method.invoke(delegate,args);
    }
    @SuppressWarnings("unchecked")
    public static Object newInstance(TwoTuple... pairs){
        Class[] interfaces = new Class[pairs.length];
        for(int i=0; i<pairs.length;i++){
            interfaces[i]=(Class)pairs[i].second;
        }
        ClassLoader cl =pairs[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl,interfaces,new MixinProxy(pairs));
    }
}
public class ExThirtyNine {
    public static void main(String[] args) {
        Object mixin = MixinProxy.newInstance(
                Tuple.typle(new BasicImp(), Basic.class),
                Tuple.typle(new TimeStampedImp(), TimeStamped.class),
                Tuple.typle(new SerialNumberedImp(),SerialNumbered.class),
                Tuple.typle(new ColoredImp(), Colored.class));
        Basic b = (Basic)mixin;
        TimeStamped t = (TimeStamped)mixin;
        SerialNumbered s = (SerialNumbered)mixin;
        Colored c = (Colored)mixin; b.set("Hello");
        System.out.println(b.get());
        System.out.println(t.getStamp());
        System.out.println(s.getSerialNumber());
        System.out.println(c.getColor());
    }
}
