package com.wzh.thik.in.java.seven;/**
 * Created by Administrator on 2017/11/11.
 */

/**
 * @author:Administrator
 * @date:2017/11/11
 * @description:
 */

class Simple{
    String s;
    public Simple(String si) { s = si; }
    @Override
    public String toString() { return s; }
    public void setString(String sNew) { s = sNew; }
}
public class ExOne {
    String s;
    Simple simple;
    public ExOne(String s){
        this.s=s;
    }
    public void check() { if(simple == null){
        System.out.println("not initialized");
    } else{
        System.out.println("initialized");
    }
    }
    public Simple getSimple(){
        if (simple == null){
           simple = new Simple(s);
        }
        return simple;
    }
    @Override
    public String toString(){
        return getSimple().toString();
    }
    public void setSimple(String s){
        getSimple().setString(s);
    }

    public static void main(String[] args) {
        ExOne exOne = new ExOne("Init String");
        exOne.check();
        System.out.println(exOne.getSimple());
        exOne.check();
        System.out.println(exOne);
        exOne.setSimple("hello");
        System.out.println(exOne);

    }
}
