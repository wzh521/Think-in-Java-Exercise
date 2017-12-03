package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
abstract  class GenericProcessor<T extends GenericProcessor<T>>{
    abstract T process(T arg);
    T test(){
        return process(null);
    }
}
class ConcreteProcessor extends  GenericProcessor<ConcreteProcessor>{
    @Override
    ConcreteProcessor process(ConcreteProcessor arg) {
        if(arg == null) return this;
        return arg;
    }
}
public class ExThirtyFour {
    public static void main(String[] args) {
        ConcreteProcessor concreteProcessor =new ConcreteProcessor();
        System.out.println(concreteProcessor==concreteProcessor.test());
    }
}
