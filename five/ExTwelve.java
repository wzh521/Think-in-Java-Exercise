package com.wzh.thik.in.java.five;/**
 * Created by Administrator on 2017/11/9.
 */

/**
 * @author:Administrator
 * @date:2017/11/9
 * @description:
 */

public class ExTwelve {
    static int counter ;
    int id = counter++;
    boolean full;
    public ExTwelve(){
        System.out.println("ExTwelve "+id +"cread");
        full =true;
    }
    public void empty (){ full =false;}

    @Override
    protected void finalize() throws Throwable {
        if(full){
            System.out.println("erro");
        }else {
            System.out.println("clean");
        }
        //super.finalize();
    }
    @Override
    public String toString() { return "ExTwelve " + id; }

    public static void main(String[] args) {
        new ExTwelve().empty();
        new ExTwelve();
        System.gc();
        System.runFinalization();

    }
}
