package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */

public class ExFifteen {
    static Switch sw = new Switch();
    static void f() throws OnOffException1, OnOffException2 { throw new RuntimeException("Inside try");
    }
    public static void main(String[] args) { try {
        try {
            sw.on();


             f();
        } catch(OnOffException1 e) { System.out.println("OnOffException1");
        } catch(OnOffException2 e) { System.out.println("OnOffException2");
        } finally { sw.off();
        }
    } catch(RuntimeException e) { System.out.println("Exception '" + e +
            "'. Did the switch get turned off?"); System.out.println(sw);
    }
    }
}
