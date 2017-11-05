package com.wzh.thik.in.java.third;/**
 * Created by Administrator on 2017/11/5.
 */

/**
 * @author:Administrator
 * @date:2017/11/5
 * @description:
 */
class Dog{
    String name;
    String says;
}
public class ExFive {
    public static void main(String[] args) {
        Dog dog1 =new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        Dog dog2 = new Dog();
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        System.out.println("dog1 name "+dog1.name+" says"+dog1.says);
        System.out.println("dog1 name "+dog2.name+" says"+dog2.says);

    }
}
