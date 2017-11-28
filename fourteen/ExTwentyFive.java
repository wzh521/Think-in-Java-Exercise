package com.wzh.thik.in.java.fourteen;/**
 * Created by Administrator on 2017/11/28.
 */

import java.lang.reflect.Method;

/**
 * @author:Administrator
 * @date:2017/11/28
 * @description:
 */

public class ExTwentyFive {
    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }

//    public static void main(String[] args) throws Exception {
//        class B extends A {
//            protected void b() {
//                super.b();
//            }
//        }
//        AobjA = new A();
////! objA.a();	Compile time error
////! objA.b();	Compile time error
////! objA.c();	Compile time error
//       callHiddenMethod(objA, "a"); callHiddenMethod(objA, "b"); callHiddenMethod(objA, "c");
//        BobjB = new B();
//        objB.b();
//    }


}
