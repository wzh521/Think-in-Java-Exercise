package com.wzh.thik.in.java.twelve;/**
 * Created by Administrator on 2017/11/20.
 */

/**
 * @author:Administrator
 * @date:2017/11/20
 * @description:
 */
class Switch{
    private boolean state = false;
    public boolean read(){return state;}
    public void on(){
        state=true;
        System.out.println(this);
    }
    public void off(){
        state=false;
        System.out.println(this);
    }
    @Override
    public String toString(){
        return state?"on":"off";
    }
}
class OnOffException1 extends  Exception{}
class OnOffException2 extends  Exception{}
public class ExFourteen {
    static Switch sw = new Switch();
    static void f() throws OnOffException1, OnOffException2 {
        throw new RuntimeException("Inside try");
    }
    public static void main(String[] args) {

        try {
            try {
                sw.on();
                 f();
                sw.off();
            } catch(OnOffException1 e) { System.out.println("OnOffException1");
                sw.off();
            } catch(OnOffException2 e) { System.out.println("OnOffException2");
                sw.off();
            }
        } catch(RuntimeException e) { System.out.println(sw);
            System.out.println("Oops! the exception '"
                + e + "' slipped through without "
                + "turning the switch off!");
        }
    }
}
