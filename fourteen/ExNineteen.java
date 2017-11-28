package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/27.
 */

import java.lang.reflect.Constructor;

/**
 * @author:Administrator
 * @date:2017/11/27
 * @description:
 */
class SuperToy extends FancierToy {
    int IQ;
    public SuperToy(int intelligence) { IQ = intelligence; }
    @Override
    public String toString() {
        return "I'm a SuperToy. I'm smarter than you.";
    }
}
public class ExNineteen {
    public static Toy makeToy(String toyName ,int IQ){
        try{
            Class<?> tClass = Class.forName(toyName);
            for(Constructor<?> ctor : tClass.getConstructors()) {
                 Class<?>[] params = ctor.getParameterTypes();
                if(params.length == 1)
                if(params[0] == int.class)
                    return (Toy)ctor.newInstance(
                        new Object[]{ Integer.valueOf(IQ) } );
            }
        }catch (Exception e){

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(makeToy("com.wzh.thik.in.java.fourteen.SuperToy", 150));
    }
}
