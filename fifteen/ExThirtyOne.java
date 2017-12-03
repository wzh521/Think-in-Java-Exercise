package com.wzh.thik.in.java.fifteen;/**
 * Created by Administrator on 2017/12/3.
 */

/**
 * @author:Administrator
 * @date:2017/12/3
 * @description:
 */
interface Payable{}
class Employee implements  Payable{}
class Hourly extends Employee implements Payable{}
public class ExThirtyOne {
    public static void main(String[] args) {
        new Employee(); new Hourly();
    }
}
