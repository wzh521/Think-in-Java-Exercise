package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */

public class ExThirteen {
    public static void throwNull() {
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        Thrower2 t = new Thrower2();
        try {
            t.f();
        } catch(ExBase e) { System.err.println("caught " + e);
        } finally {
            System.out.println("In finally clause A");
        }
        try {
            throwNull();
            t.f();
        } catch(ExBase e) { System.err.println("caught " + e);
        } finally {
            System.out.println("In finally clause B");
        }
    }
}
