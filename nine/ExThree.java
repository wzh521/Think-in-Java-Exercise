package com.wzh.thik.in.java.nine;/**
 * Created by Administrator on 2017/11/14.
 */

/**
 * @author:Administrator
 * @date:2017/11/14
 * @description:
 */
abstract class Base{
    abstract void print();
    public Base(){
        print();
    }
}
class Export extends Base{
    private int num = 10;
    @Override
    void print() {
        System.out.println("num = "+num);
    }
}
public class ExThree {
    public static void main(String[] args) {
        Export export = new Export();
        export.print();
    }
}
